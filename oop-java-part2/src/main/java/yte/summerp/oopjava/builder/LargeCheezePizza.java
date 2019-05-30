package yte.summerp.oopjava.builder;

public class LargeCheezePizza extends VegeterianPizza {
	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Dört Peynirli Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.LARGE;
	}
}
