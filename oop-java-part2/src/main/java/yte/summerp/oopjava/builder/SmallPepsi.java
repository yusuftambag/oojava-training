package yte.summerp.oopjava.builder;

public class SmallPepsi extends Pepsi {
	@Override
	public String name(){
		return "250ml Pepsi";
	}

	@Override
	public ItemSize size() {
		return ItemSize.MEDIUM;
	}

	@Override
	public float price() {
		return 8.f;
	}
}
