package yte.summerp.oopjava.factory;

public class Ingerident {
	private String ingeridentName;
	private double ingeridentAmount;
	private Unit ingeridentUnit;

	public Ingerident(String ingeridentName, double ingeridentAmount, Unit ingeridentUnit) {
		this.ingeridentName = ingeridentName;
		this.ingeridentAmount = ingeridentAmount;
		this.ingeridentUnit = ingeridentUnit;
	}

	public String getIngeridentName() {
		return ingeridentName;
	}

	public double getIngeridentAmount() {
		return ingeridentAmount;
	}

	public Unit getIngeridentUnit() {
		return ingeridentUnit;
	}
}
