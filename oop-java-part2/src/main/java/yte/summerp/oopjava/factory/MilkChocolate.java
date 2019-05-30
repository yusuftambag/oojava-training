package yte.summerp.oopjava.factory;

public class MilkChocolate extends DefaultChocolate {
	public MilkChocolate() {
		setPrice(25);
	}

	@Override
	public String getName() {
		return "Milk Chocolate";
	}
}
