package yte.summerp.oopjava.builder;

public class MediumPepsi extends Pepsi {
	@Override
	public String name(){
		return "330ml Pepsi";
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
