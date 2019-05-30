package yte.summerp.oopjava.abstraction;

public class AndroidSarjCihazi extends AbstractPluggableItem {
	private boolean burned;
	private int lastAppliedVoltage;

	public boolean isBurned() {
		return burned;
	}

	public void plug(int voltage) {
		lastAppliedVoltage = voltage;
		if(lastAppliedVoltage<200 || lastAppliedVoltage>250)
			burned = true;
	}
}
