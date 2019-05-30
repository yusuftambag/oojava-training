package yte.summerp.oopjava.aggregation;

public class TableRunner {
	public static void main(String argv[]) {
		Table table=new Table("Dining Table");
		TableLeg first=new TableLeg();
		first.setLegth(100);
		TableLeg second=new TableLeg();
		first.setLegth(100);
		TableLeg third=new TableLeg();
		first.setLegth(100);
		TableLeg fourth=new TableLeg();
		first.setLegth(101);
		try {
			table.addLeg(first);
			table.addLeg(second);
			table.addLeg(third);
			table.addLeg(fourth);
		} catch (Exception ex) {
			System.out.println("This must not occur since we added legs no more than 4: "+ex.getMessage());
		}
	}
}
