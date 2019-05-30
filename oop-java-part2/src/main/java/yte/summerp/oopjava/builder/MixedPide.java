package yte.summerp.oopjava.builder;

public class MixedPide extends MeatyPizza {
	@Override
	public float price() {
		return 20;
	}

	@Override
	public String name() {
		return "Karışık Pide (Ey Edip Adanada Pide Ye)";
	}

	@Override
	public ItemSize size() {
		return ItemSize.LARGE;
	}
}
