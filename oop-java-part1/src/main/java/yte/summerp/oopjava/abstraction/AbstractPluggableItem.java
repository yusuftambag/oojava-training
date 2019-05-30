package yte.summerp.oopjava.abstraction;

public abstract class AbstractPluggableItem {
	private int minVoltage;
	private int maxVoltage;

	public int getMinVoltage() {
		return minVoltage;
	}

	public void setMinVoltage(int minVoltage) {
		this.minVoltage=minVoltage;
	}

	public int getMaxVoltage() {
		return maxVoltage;
	}

	public void setMaxVoltage(int maxVoltage) {
		this.maxVoltage=maxVoltage;
	}

	public abstract boolean isBurned();

	void setCurrentVoltage(int voltage) {
		plug(voltage);
	}

	public abstract void plug(int voltage);
}
