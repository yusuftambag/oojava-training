package yte.summerp.oopjava.aggregation;

import java.util.List;

public class Table {
	private String tableName;
	List<TableLeg> legList;

	public Table(String tableName) {
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public Boolean needsRepairing() {
		// TODO: Implement this method
		return null;
	}

	public void addLeg(TableLeg tableLeg) throws Exception {
		if(legList.size()==4)
			throw new RuntimeException("Table legs can not be more than 4!");
		legList.add(tableLeg);
	}

	public List<TableLeg> getTableLegs() {
		return legList;
	}
}
