package yte.summerp.oopjava.builder;

public class LargePepsi extends Pepsi {
	@Override
	public String name(){
		return "500ml Pepsi";
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
