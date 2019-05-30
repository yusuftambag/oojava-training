package yte.summerp.oopjava.factory;

public class SquareChocolate extends DefaultChocolate {
	public SquareChocolate() {
		setPrice(17);
	}
	@Override
	public String getName() {
		return "Square Chocolate";
	}
}
