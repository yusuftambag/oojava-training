package yte.summerp.oopjava.polymorphism;

import yte.summerp.oopjava.encapsulation.Starship;
import yte.summerp.oopjava.inheritance.Animal;

public class Polyanna {
	private PolyannaStatus status;

	public Polyanna() {
		setStatus();
	}

	public void kicked() {
		System.out.println("Polyanna kicked by: something unknown, (perharps Peter's joke!!)");
		setStatus(PolyannaStatus.HAPPY);
	}

	public void kicked(Animal animal) {
		System.out.println("Polyanna kicked by: "+animal.getName());
		setStatus(PolyannaStatus.HAPPY);
	}

	public void kicked(Starship starship) {
		System.out.println("Polyanna kicked by: "+starship.getShipName());
		setStatus(PolyannaStatus.HAPPY);
	}

	private void setStatus(PolyannaStatus status) {
		this.status = status;
	}

	private void setStatus() {
		this.status = PolyannaStatus.HAPPY;
	}
}
