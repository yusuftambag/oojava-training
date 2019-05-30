package yte.summerp.oopjava.builder;

public class MediumCheezePizza extends VegeterianPizza {
	@Override
	public float price() {
		return 20f;
	}

	@Override
	public String name() {
		return "Dört Peynirli Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.MEDIUM;
	}
}
