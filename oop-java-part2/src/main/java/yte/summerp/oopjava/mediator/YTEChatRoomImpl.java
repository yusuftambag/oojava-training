package yte.summerp.oopjava.mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class YTEChatRoomImpl implements YTEChatRoom {
	private static final DateFormat DATE_FORMAT= new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss.SSS");

	@Override
	public void showMsg(String msg, Participant p) {
		System.out.println(p.getName()+"'gets message: "+msg);
		Date date = Calendar.getInstance().getTime();
		System.out.println("\t\t\t\t"+"["+ DATE_FORMAT.format(date).toString()+"]");
	}
}
