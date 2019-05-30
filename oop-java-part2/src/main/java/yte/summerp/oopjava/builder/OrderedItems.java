package yte.summerp.oopjava.builder;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {
	private List<Item> items=new ArrayList<Item>();

	public void addItem(Item item){
		items.add(item);
	}

	public float getCost(){
		float cost=0.0f;
		for (Item item : items) {
			cost+=item.price();
		}
		return cost;
	}
	public void showItems(){
		for (Item item : items) {
			System.out.println("Item is:" +item.name());
			System.out.println("Size is:" +item.size());
			System.out.println("Price is: " +item.price());

		}
	}
}
