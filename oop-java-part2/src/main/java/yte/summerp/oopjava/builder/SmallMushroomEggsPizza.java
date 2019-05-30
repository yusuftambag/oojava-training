package yte.summerp.oopjava.builder;

public class SmallMushroomEggsPizza extends VegeterianPizza{
	@Override
	public float price() {
		return 12.5f;
	}

	@Override
	public String name() {
		return "Mushroom Eggs Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.SMALL;
	}
}
