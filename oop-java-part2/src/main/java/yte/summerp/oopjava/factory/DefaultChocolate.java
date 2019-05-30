package yte.summerp.oopjava.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultChocolate implements Chocolate {
	private List<Ingerident> ingeridents;
	private int stockQuantity;
	private double price;
	private int soldCount=0;

	public abstract String getName();

	public List<Ingerident> getIngredients() {
		return ingeridents;
	}

	public void addIngerident(Ingerident ingerident) {
		if(ingeridents==null)
			ingeridents = new ArrayList<Ingerident>();
		ingeridents.add(ingerident);
	}

	public int getInStockQuantity() {
		return stockQuantity;
	}

	public double getPrice() {
		return price;
	}

	public synchronized boolean sell(int quantity) {
		if(quantity>stockQuantity)
			return false;
		stockQuantity-=quantity;
		soldCount+=quantity;
		return true;
	}

	@Override
	public void addToStock(int quantity) {
		if(quantity>0)
			stockQuantity+=quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
