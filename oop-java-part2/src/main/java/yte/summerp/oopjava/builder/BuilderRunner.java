package yte.summerp.oopjava.builder;

public class BuilderRunner {
	public static void main(String argv[]) throws Exception {
		OrderedItems orderedItems=new OrderBuilder().preparePizzaOrder();
		System.out.println("Total price:"+orderedItems.getCost()+"\n");
		orderedItems.showItems();
	}
}
