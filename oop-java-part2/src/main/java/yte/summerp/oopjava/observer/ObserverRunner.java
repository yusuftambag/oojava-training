package yte.summerp.oopjava.observer;

public class ObserverRunner {
	public static void main(String argv[]) {
		WebsiteHandler handler=new WebsiteHandler();
		WebPage rootPage=handler.getRootPage();

		handler.pageModified(rootPage.getChildAt(2));
		WebPage webPage=new WebPage("Deneme");
		handler.addPage(webPage,rootPage.getChildAt(3).getChildAt(0));
		handler.deletePage(rootPage.getChildAt(1).getChildAt(2));
		handler.pageModified(rootPage.getChildAt(1).getChildAt(1));
	}
}
