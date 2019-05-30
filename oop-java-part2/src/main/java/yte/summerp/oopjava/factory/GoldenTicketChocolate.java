package yte.summerp.oopjava.factory;

public class GoldenTicketChocolate extends SquareChocolate {
	private boolean hasGoldenTicket=false;

	public GoldenTicketChocolate() {
		super();
		setPrice(75);
	}

	public boolean hasGoldenTicket() {
		return hasGoldenTicket;
	}

	public void addGoldenTicket() {
		hasGoldenTicket = true;
	}

	public boolean stealGoldenTicket() {
		if(hasGoldenTicket) {
			hasGoldenTicket = false;
			return true;
		} else
			return false;
	}
}
