package yte.summerp.oopjava.builder;

public class MixedPizza extends MeatyPizza {
	@Override
	public float price() {
		return 20;
	}

	@Override
	public String name() {
		return "Karışık Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.SMALL;
	}
}
