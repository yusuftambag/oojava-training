package yte.summerp.oopjava.observer;

public class WebPageEvent {
	private EventType eventType;
	private WebPage webPage;

	public WebPageEvent(EventType eventType,WebPage webPage) {
		this.eventType = eventType;
		this.webPage = webPage;
	}

	public EventType getEventType() {
		return eventType;
	}

	public WebPage getWebPage() {
		return webPage;
	}
}
