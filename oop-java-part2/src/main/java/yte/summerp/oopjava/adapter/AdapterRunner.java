package yte.summerp.oopjava.adapter;

public class AdapterRunner {
	public static void main(String argv[]) {
		GeneralPoliceStation generalPoliceStation = new GeneralPoliceStation();
		generalPoliceStation.addCallRecord("Çukurambar",new CallRecord("13643312","Ahmet Tangöze","Junior Jack Pote","ddfewffwe"));
		generalPoliceStation.addCallRecord("Bahçelievler",new CallRecord("13643432","Kadir İnanmaz","Chef İnan Artık","ddfewffwe"));
		generalPoliceStation.addCallRecord("Cebeci",new CallRecord("29285112","Anonim","Junior Jack Pote","ddfewffwe"));
		generalPoliceStation.addCallRecord("Çukurambar",new CallRecord("112","Anonim","Chef İnan Artık","ddfewffwe"));
		generalPoliceStation.addCallRecord("Çukurambar",new CallRecord("155","Mehmet Rençber","Junior Jack Pote","ddfewffwe"));
		generalPoliceStation.addCallRecord("Bahçelievler",new CallRecord("23186231","Anonim","Junior Jack Pote","ddfewffwe"));
		generalPoliceStation.addCallRecord("Çukurambar",new CallRecord("1289698721","Anonim","Junior Jack Pote","ddfewffwe"));
		generalPoliceStation.addCallRecord("Ulus",new CallRecord("1268612","Ahmet Tangöze","Hakan Taşıyamayan","ddfewffwe"));

		generalPoliceStation.addRobber("Çukurambar",new Robber("Ahmet Tangöze","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Ahmet Tangöze","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Anonim","Çankaya"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Mehmet Kaplan","Ulus"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Hasan Uzun","Cebeci"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Ahmet Tangöze","Eskişehir"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Mahir Tan","Sivrihisar"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Ahmet Tangöze","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Tanju Tantan","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Anonim","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Anonim","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Anonim","Trabzon"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Hakan Beter","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Beter Böcek","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Alice Velice","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Adnan Uygur","Olay Yeri"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Tarık Takır","Malatya"));
		generalPoliceStation.addRobber("Çukurambar",new Robber("Ahmet Tangöze","Samsun"));
		NeighborhoodPoliceStation cukurambarStation=new NeighborhoodPoliceStation(new StationTaskAdapter(generalPoliceStation),"Çukurambar");
		cukurambarStation.startProcessing();
	}
}
