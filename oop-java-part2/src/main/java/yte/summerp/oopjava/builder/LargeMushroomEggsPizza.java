package yte.summerp.oopjava.builder;

public class LargeMushroomEggsPizza extends VegeterianPizza{
	@Override
	public float price() {
		return 17.5f;
	}

	@Override
	public String name() {
		return "Mushroom Eggs Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.LARGE;
	}
}
