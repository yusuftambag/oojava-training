package yte.summerp.oopjava.builder;

public class MediumCocaCola extends CocaCola {
	@Override
	public String name(){
		return "330ml Coca Cola";
	}

	@Override
	public ItemSize size() {
		return ItemSize.MEDIUM;
	}

	@Override
	public float price() {
		return 10.f;
	}
}
