package yte.summerp.oopjava.abstraction;

public class IPhoneSarzCihazi extends AbstractPluggableItem {
	boolean burned;
	int lastAppliedVoltage;

	public IPhoneSarzCihazi() {
		setMaxVoltage(225);
		setMinVoltage(215);
	}

	public boolean isBurned() {
		return burned;
	}

	public void plug(int voltage) {
		lastAppliedVoltage = voltage;
		if(lastAppliedVoltage<215 || lastAppliedVoltage>225)
			burned = true;
	}
}
