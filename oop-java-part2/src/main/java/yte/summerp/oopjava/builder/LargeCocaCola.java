package yte.summerp.oopjava.builder;

public class LargeCocaCola extends CocaCola {
	@Override
	public String name(){
		return "500ml Coca Cola";
	}

	@Override
	public ItemSize size() {
		return ItemSize.LARGE;
	}

	@Override
	public float price() {
		return 12.f;
	}
}
