package yte.summerp.oopjava.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneralPoliceStation {
	private HashMap<String,List<Robber>> robberMapByNeighborhood=new HashMap<String, List<Robber>>();

	private HashMap<String,List<CallRecord>> callRecordMap=new HashMap<String, List<CallRecord>>();

	public void addRobber(String stationName,Robber robber) {
		List<Robber> robberList=robberMapByNeighborhood.get(stationName);
		if(robberList==null) {
			robberList=new ArrayList<Robber>();
			robberMapByNeighborhood.put(stationName,robberList);
		}
		robberList.add(robber);
	}

	public List<Robber> getRobbersFor(String stationName) {
		return robberMapByNeighborhood.get(stationName);
	}

	public void addCallRecord(String stationName,CallRecord callRecord) {
		List<CallRecord> callRecordList = callRecordMap.get(stationName);

		if(callRecordList==null) {
			callRecordList = new ArrayList<CallRecord>();
			callRecordMap.put(stationName,callRecordList);
		}
		callRecordList.add(callRecord);
	}

	public List<CallRecord> getCallRecordsFor(String stationName) {
		return callRecordMap.get(stationName);
	}
}
