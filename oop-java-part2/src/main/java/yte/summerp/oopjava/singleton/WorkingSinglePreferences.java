package yte.summerp.oopjava.singleton;

public class WorkingSinglePreferences implements SinglePreferences {
	@Override
	public boolean outAtNights() {
		return true;
	}

	@Override
	public boolean isWorking() {
		return true;
	}

	@Override
	public int getTotalWeeklyWorkHours() {
		return 45;
	}

	@Override
	public int getFunHoursInWeek() {
		return 10;
	}

	@Override
	public boolean hasPlayStation() {
		return false;
	}

	@Override
	public double getWeeklyWage() {
		return 2500;
	}
}
