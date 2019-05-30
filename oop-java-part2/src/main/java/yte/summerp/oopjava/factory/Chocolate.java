package yte.summerp.oopjava.factory;

import java.util.List;

public interface Chocolate {
	 List<Ingerident> getIngredients();

	 int getInStockQuantity();

	 double getPrice();

	 boolean sell(int quantity);

	 void addToStock(int quantity);

	 String getName();
}
