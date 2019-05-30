package yte.summerp.oopjava.adapter;

import java.util.ArrayList;
import java.util.List;

public class Robber {
	private String robberName;
	private String lastSeenAt;
	private List<String> robbedLocations=new ArrayList<String>();

	public Robber(String robberName,String lastSeenAt) {
		this.robberName = robberName;
		this.lastSeenAt = lastSeenAt;
	}

	public String getRobberName() {
		return robberName;
	}

	public void setRobberName(String robberName) {
		this.robberName=robberName;
	}

	public String getLastSeenAt() {
		return lastSeenAt;
	}

	public void setLastSeenAt(String lastSeenAt) {
		this.lastSeenAt=lastSeenAt;
	}

	public void addLocation(String neighborhood) {
		robbedLocations.add(neighborhood);
	}
}
