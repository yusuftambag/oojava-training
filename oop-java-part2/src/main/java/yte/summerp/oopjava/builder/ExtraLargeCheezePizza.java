package yte.summerp.oopjava.builder;

public class ExtraLargeCheezePizza extends VegeterianPizza {
	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Dört Peynirli Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.EXTRA_EXTRA_LARGE;
	}
}
