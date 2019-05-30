package yte.summerp.oopjava.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WebPage extends Observable {
	private List<WebPage> childPages=new ArrayList<WebPage>();
	private String pageName;
	private String pageCode;

	public WebPage(String pageName) {
		this.pageName = pageName;
	}

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public String getPageCode() {
		return pageCode;
	}

	public String getPageName() {
		return pageName;
	}

	public WebPage getChildAt(int index) {
		if(childPages.size()>index)
			return childPages.get(index);
		return null;
	}

	public void addChild(WebPage childPage) {
		childPages.add(childPage);
	}

	public void insertChild(int index,WebPage childPage) {
		while (childPages.size()<index)
			childPages.add(null);
		childPages.add(index,childPage);
	}

	public List<WebPage> getChildren() {
		return childPages;
	}

	@Override
	public void notifyObservers(Object arg) {
		setChanged();
		super.notifyObservers(arg);
	}
}
