package yte.summerp.oopjava.singleton;

public class DefaultSinglePreferences implements SinglePreferences {
	@Override
	public boolean outAtNights() {
		return true;
	}

	@Override
	public boolean isWorking() {
		return false;
	}

	@Override
	public int getTotalWeeklyWorkHours() {
		return 0;
	}

	@Override
	public int getFunHoursInWeek() {
		return 50;
	}

	@Override
	public boolean hasPlayStation() {
		return true;
	}

	@Override
	public double getWeeklyWage() {
		return 50;
	}
}
