package yte.summerp.oopjava.adapter;

import java.util.ArrayList;
import java.util.List;

public class StationTaskAdapter implements DailyPoliceStationTasks {
	private GeneralPoliceStation centralStation;

	public StationTaskAdapter(GeneralPoliceStation centralStation) {
		this.centralStation = centralStation;
	}

	@Override
	public List<String> getRobberNames(String stationName) {
		List<Robber> robberList=centralStation.getRobbersFor(stationName);
		List<String> robberNames=new ArrayList<String>();

		if(robberList!=null) {
			for(Robber robber:robberList)
				robberNames.add(robber.getRobberName());
		}
		return robberNames;
	}

	@Override
	public List<NeighborhoodCase> getCaseReporters(String stationName) {
		throw new IllegalArgumentException("This method is not implemented yet!!!");
	}
}
