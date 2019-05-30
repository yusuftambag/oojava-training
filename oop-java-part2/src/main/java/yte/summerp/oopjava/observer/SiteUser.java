package yte.summerp.oopjava.observer;

import java.util.Observable;
import java.util.Observer;

public class SiteUser implements Observer {
	private String userName;

	public SiteUser(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg==null || o==null) {
			System.out.println("Invalid event found: "+arg);
			return;
		}
		if(arg instanceof WebPageEvent) {
			WebPageEvent webPageEvent=(WebPageEvent) arg;
			System.out.println(userName+" received "+webPageEvent.getEventType()+" event of page: "+webPageEvent.getWebPage().getPageName());
		} else {
			System.out.println("Invalid event found: "+arg);
		}
	}
}
