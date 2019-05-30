package yte.summerp.oopjava.mediator;

public class MediatorPatternRunner {
	public static void main(String args[])
	{

		YTEChatRoom chat = new YTEChatRoomImpl();

		User1 u1=new User1(chat);
		u1.setName("Ahmet ORAK");
		u1.sendMsg("Hi Hakan! how are you?");


		User2 u2=new User2(chat);
		u2.setName("Hakan KÜLLÜK");
		u2.sendMsg("I am Fine! You tell?");
	}

}
