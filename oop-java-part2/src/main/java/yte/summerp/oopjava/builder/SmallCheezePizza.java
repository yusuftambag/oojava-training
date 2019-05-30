package yte.summerp.oopjava.builder;

public class SmallCheezePizza extends VegeterianPizza {
	@Override
	public float price() {
		return 15.0f;
	}

	@Override
	public String name() {
		return "Dört Peynirli Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.SMALL;
	}
}
