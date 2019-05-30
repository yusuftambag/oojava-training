package yte.summerp.oopjava.adapter;

import java.util.List;

public class NeighborhoodPoliceStation {
	private String stationName;
	private DailyPoliceStationTasks dailyPoliceStationTasks;

	public NeighborhoodPoliceStation(DailyPoliceStationTasks dailyPoliceStationTasks,String stationName) {
		this.dailyPoliceStationTasks = dailyPoliceStationTasks;
		this.stationName = stationName;
	}

	public void startProcessing() {
		List<String> robberList=dailyPoliceStationTasks.getRobberNames(stationName);
		for(String robber:robberList) {
			System.out.println("Quest robber '"+robber+"' within neighborhood...");
		}
		// TODO: Investigate cases here..
		List<NeighborhoodCase> caseList=dailyPoliceStationTasks.getCaseReporters(stationName);
	}
}
