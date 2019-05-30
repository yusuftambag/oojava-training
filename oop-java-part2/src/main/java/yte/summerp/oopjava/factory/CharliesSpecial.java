package yte.summerp.oopjava.factory;

public class CharliesSpecial extends DefaultChocolate {
	public CharliesSpecial() {
		addIngerident(new Ingerident("sugar",100,Unit.GRAM));
		addIngerident(new Ingerident("hazelnuts",1,Unit.PIECE));
		addIngerident(new Ingerident("milk",25,Unit.MILILITER));
		addIngerident(new Ingerident("cocoa",150,Unit.GRAM));
		addIngerident(new Ingerident("vanilla",50,Unit.GRAM));
		addIngerident(new Ingerident("palm oil",10,Unit.MILILITER));
		setPrice(50);
	}

	@Override
	public String getName() {
		return "Charlie's Special Chocolate";
	}
}
