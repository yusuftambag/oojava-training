package yte.summerp.oopjava.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WindowsCmdCommand extends AbstractCommand {
	private String command;
	private String[] parameters;
	public WindowsCmdCommand(String command,String...parameters) {
		this.command = command;
		this.parameters = parameters;
	}

	private StringBuffer readStream(InputStream inputStream) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuffer buffer=new StringBuffer();
		String line=null;
		try {
			while ((line=reader.readLine()) != null) {
				if(isAborted())
					return null;
				buffer.append(line + "\n");
			}
		} catch (Exception ex) {
			buffer.append("Error occured: "+ex.getMessage());
		} finally {
			try {
				reader.close();
			} catch (Exception ex2) {
			}
		}
		return buffer;
	}

	@Override
	public CommandResult execute() throws CommandException {
		String cmdArray[]=(parameters==null ? new String[1] : new String[parameters.length+1]);
		cmdArray[0] = command;
		int i=1;
		for(String parameter:parameters) {
			cmdArray[i++]=parameter;
		}
		Process process=null;
		try {
			new Thread().sleep(10000);
			if(!isAborted()) {
				process=Runtime.getRuntime().exec(cmdArray);
				StringBuffer inputBuffer=readStream(process.getInputStream());
				StringBuffer errorBuffer=readStream(process.getErrorStream());
				if(isAborted())  {
					process.destroy();
					setFinished(true);
					setSuccess(false);
					return new CommandResult(ExecutionStatus.ABORTED,"Process destroyed upon abort request!!");
				}
				int exitVal=process.waitFor();
				ExecutionStatus executionStatus=exitVal == 0 ? ExecutionStatus.SUCCESS : ExecutionStatus.FAILURE;
				switch (executionStatus) {
					case SUCCESS:
						append(inputBuffer.toString());
						break;
					case FAILURE:
						append(errorBuffer.toString());
						break;
				}
				setFinished(true);
				setSuccess(true);
				return new CommandResult(executionStatus,getResultBuffer().toString());
			} else  {
				setFinished(true);
				setSuccess(false);
				return new CommandResult(ExecutionStatus.ABORTED,"Process not started upon abort request!!");
			}

		} catch (IOException e) {
			return new CommandResult(ExecutionStatus.FAILURE,"IO error occured: "+e.getMessage());
		} catch (InterruptedException e) {
			return new CommandResult(ExecutionStatus.FAILURE,"Interrupted execution: "+e.getMessage());
		}
	}
}
