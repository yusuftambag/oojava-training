package yte.summerp.oopjava.observer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.StringTokenizer;

public class WebsiteHandler extends Observable {
	private WebPage rootPage;
	private UserManager userManager = new UserManager();

	public WebsiteHandler(WebPage rootPage) {
		this.rootPage = rootPage;
	}

	public WebsiteHandler() {
		initialize();
	}

	public void addPage(WebPage webPage,WebPage parentPage) {
		parentPage.addChild(webPage);
		WebPageEvent webPageEvent=new WebPageEvent(EventType.ADDED,webPage);
		parentPage.notifyObservers(webPageEvent);
	}

	public void pageModified(WebPage webPage) {
		WebPageEvent webPageEvent=new WebPageEvent(EventType.UPDATED,webPage);
		webPage.notifyObservers(webPageEvent);
	}

	public void deletePage(WebPage webPage) throws IllegalArgumentException {
		if(webPage==rootPage)
			throw new IllegalArgumentException("Root page can not be deleted!!!");
		if(deletePage(webPage,rootPage))
			webPage.notifyObservers(new WebPageEvent(EventType.DELETED,webPage));
		else
			System.out.println("Page could not be deleted: "+webPage.getPageName());
	}

	private boolean deletePage(WebPage toDelete,WebPage currentNode) {
		List<WebPage> children=currentNode.getChildren();
		boolean removed=children.remove(toDelete);
		if(!removed) {
			for(WebPage page:children) {
				if(deletePage(toDelete,page))
					return true;
			}
			return false;
		} else
			return true;
	}

	public WebPage getRootPage() {
		return rootPage;
	}

	private void initialize() {
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream("web_page_tree.txt");
		BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
		try {
			String rootPageString=reader.readLine();
			this.rootPage = parsePage(rootPageString);
			List<WebPage> pageList=new ArrayList<WebPage>();
			String line=null;
			while ((line=reader.readLine())!=null) {
				pageList.add(parsePage(line));
			}
			for(WebPage page:pageList) {
				String pageCode=page.getPageCode();
				int index=pageCode.indexOf(".");
				placePageInHierarchy(page,rootPage,pageCode.substring(index+1));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception ex2) {

			}
		}
	}

	private void placePageInHierarchy(WebPage pageToPlace,WebPage currentNode,String currentCode) {
		int index=currentCode.indexOf('.');
		if(index==-1) {
			int val=Integer.parseInt(currentCode);
			currentNode.insertChild(val-1,pageToPlace);
		} else {
			int val=Integer.parseInt(currentCode.substring(0,index));
			placePageInHierarchy(pageToPlace,currentNode.getChildAt(val-1),currentCode.substring(index+1));
		}
	}

	private WebPage parsePage(String pageInfo) {
		int index=pageInfo.indexOf(' ');
		if(index==-1)
			return null;
		String code=pageInfo.substring(0,index);
		pageInfo=pageInfo.substring(index+1).trim();
		index=pageInfo.indexOf(',');
		if(index==-1) {
			WebPage webPage = new WebPage(pageInfo);
			webPage.setPageCode(code);
			return webPage;
		} else {
			String pageName=pageInfo.substring(0,index).trim();
			WebPage webPage=new WebPage(pageName);
			webPage.setPageCode(code);
			String usersString=pageInfo.substring(index+1).trim();
			StringTokenizer tokenizer=new StringTokenizer(usersString,",");
			while (tokenizer.hasMoreTokens()) {
				String token=tokenizer.nextToken().trim();
				SiteUser siteUser=userManager.getUserByName(token);
				webPage.addObserver(siteUser);
			}
			return webPage;
		}
	}
}
