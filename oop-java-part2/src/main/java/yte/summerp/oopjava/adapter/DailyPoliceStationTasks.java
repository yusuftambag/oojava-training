package yte.summerp.oopjava.adapter;

import java.util.List;

public interface DailyPoliceStationTasks {
	List<String> getRobberNames(String stationName);

	List<NeighborhoodCase> getCaseReporters(String stationName);
}
