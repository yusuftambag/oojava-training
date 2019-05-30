package yte.summerp.oopjava.polymorphism;

public class AnimalKicker extends AbstractKicker {
	public void kick(Polyanna polyanna) {
		polyanna.kicked(this);
		System.out.println("Some animal kicks Poly, name: "+getName());
	}

	public String getName() {
		return "Animal";
	}

	public boolean canBreathe() {
		return false;
	}

	public boolean hasLegs() {
		return false;
	}

	public boolean canMove() {
		return false;
	}
}
