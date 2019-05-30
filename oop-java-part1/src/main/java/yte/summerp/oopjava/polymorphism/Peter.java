package yte.summerp.oopjava.polymorphism;

public class Peter implements KickerItem {

	public void kick(Polyanna polyanna) {
		polyanna.kicked();
		System.out.println("peter kicked polyanna...");
	}
}
