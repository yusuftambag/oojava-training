package yte.summerp.oopjava.builder;

public class MediumMushroomEggsPizza extends VegeterianPizza{
	@Override
	public float price() {
		return 15.0f;
	}

	@Override
	public String name() {
		return "Mushroom Eggs Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.MEDIUM;
	}
}
