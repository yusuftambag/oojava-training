package yte.summerp.oopjava.builder;

public class TurkishPizza extends MeatyPizza {
	@Override
	public float price() {
		return 10;
	}

	@Override
	public String name() {
		return "Lahmacun";
	}

	@Override
	public ItemSize size() {
		return ItemSize.MEDIUM;
	}
}
