package yte.summerp.oopjava.inheritance;

public class Lion implements FourLeggedAnimal {
	public int getLegCount() {
		return 4;
	}

	public boolean canBreathe() {
		return true;
	}

	public boolean hasLegs() {
		return true;
	}

	public boolean canMove() {
		return true;
	}

	public String getName() {
		return "The King";
	}
}
