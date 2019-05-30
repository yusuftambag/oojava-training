package yte.summerp.oopjava.command;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpRequestCommand extends AbstractCommand {
	private String httpUrl;
	private String requestType;
	private Map<String,String> requestParameters;

	public HttpRequestCommand(String httpUrl,String requestType,Map<String,String> requestParameters) {
		this.httpUrl = httpUrl;
		this.requestParameters = requestParameters;
		this.requestType = requestType;
	}

	@Override
	public CommandResult execute() throws CommandException {
		CloseableHttpClient httpClient=null;
		try {
			httpClient=HttpClients.createDefault();
			HttpUriRequest httpRequest;
			switch (requestType) {
				case "GET":
					httpRequest=new HttpGet(httpUrl);
					break;
				case "PUT":
					httpRequest=new HttpPost(httpUrl);
					break;
				default:
					return new CommandResult(ExecutionStatus.FAILURE, "Invalid request type: " + requestType);
			}
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			if(requestParameters!=null && requestParameters.size()>0 && requestType.equals("POST")) {
				Set<String> keyset=requestParameters.keySet();
				for(String key:keyset) {
					nvps.add(new BasicNameValuePair(key,requestParameters.get(key)));
				}
				((HttpPost) httpRequest).setEntity(new UrlEncodedFormEntity(nvps));
			} else if(requestParameters!=null && requestParameters.size()>0 && !requestType.equals("POST")) {
				return new CommandResult(ExecutionStatus.FAILURE, "GET request does not accept parameters, please append parameters to the url!!!");
			}
			if(isAborted()) {
				setFinished(true);
				setSuccess(false);
				return new CommandResult(ExecutionStatus.ABORTED,"Http Request not started upon abort request!!");
			}

			CloseableHttpResponse response=httpClient.execute(httpRequest);
			int statusCode=response.getStatusLine().getStatusCode();
			CommandResult commandResult = null;
			if(statusCode==200) {
				commandResult = new CommandResult(ExecutionStatus.SUCCESS,EntityUtils.toString(response.getEntity()));
			} else {
				commandResult = new CommandResult(ExecutionStatus.FAILURE,response.getStatusLine().getStatusCode()+" : "+response.getStatusLine().getReasonPhrase());
			}
			response.close();
			return commandResult;
		} catch (Exception ex) {
			return new CommandResult(ExecutionStatus.FAILURE, "Exception during request: " + ex.getMessage());
		} finally {
			try {
				httpClient.close();
			} catch (Exception ex2) {

			}
		}
	}
}
