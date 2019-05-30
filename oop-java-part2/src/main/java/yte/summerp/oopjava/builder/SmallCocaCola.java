package yte.summerp.oopjava.builder;

public class SmallCocaCola extends CocaCola {
	@Override
	public String name() {
		return "250ml Coca Cola";
	}

	@Override
	public ItemSize size() {
		return ItemSize.SMALL;
	}

	@Override
	public float price() {
		return 8f;
	}
}
