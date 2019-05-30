package yte.summerp.oopjava.singleton;

public class SinglePattern {
	private static SinglePattern I_AM_SINGLE;
	private SinglePreferences preferences;

	private SinglePattern(SinglePreferences preferences) {
		setPreferences(preferences);
	}

	private void setPreferences(SinglePreferences preferences) {
		this.preferences = preferences;
	}

	public static SinglePattern getInstance() {
		if(I_AM_SINGLE==null)
			I_AM_SINGLE = new SinglePattern(new DefaultSinglePreferences());
		return I_AM_SINGLE;
	}

	public SinglePreferences getPreferences() {
		return preferences;
	}

	public static SinglePattern getInstance(SinglePreferences preferences) {
		if(I_AM_SINGLE==null)
			I_AM_SINGLE = new SinglePattern(preferences);
		I_AM_SINGLE.setPreferences(preferences);
		return I_AM_SINGLE;
	}
}
