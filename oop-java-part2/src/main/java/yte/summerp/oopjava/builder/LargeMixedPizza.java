package yte.summerp.oopjava.builder;

public class LargeMixedPizza extends MeatyPizza {
	@Override
	public float price() {
		return 35;
	}

	@Override
	public String name() {
		return "Karışık Pizza";
	}

	@Override
	public ItemSize size() {
		return ItemSize.EXTRA_LARGE;
	}
}
