package yte.summerp.oopjava.singleton;

public class SigletonPatternRunner {
	public static void main(String argv[]) {
		SinglePattern singlePattern=SinglePattern.getInstance();
		System.out.println("Non-working single\n");
		SinglePreferences singlePreferences = singlePattern.getPreferences();
		System.out.println("Fun Hours: "+singlePreferences.getFunHoursInWeek()+" Weekly Income: "+singlePreferences.getWeeklyWage()+" Playstation: "+singlePreferences.hasPlayStation());

		// Now check working...
		WorkingSinglePreferences workingPreferences=new WorkingSinglePreferences();
		singlePattern = SinglePattern.getInstance(workingPreferences);
		singlePreferences = singlePattern.getPreferences();
		System.out.println("Fun Hours: "+singlePreferences.getFunHoursInWeek()+" Weekly Income: "+singlePreferences.getWeeklyWage()+" Playstation: "+singlePreferences.hasPlayStation()+" Work hours: "+singlePreferences.getTotalWeeklyWorkHours()+" Happiness: %"+(100.0*singlePreferences.getFunHoursInWeek()/singlePreferences.getTotalWeeklyWorkHours()));
	}
}
