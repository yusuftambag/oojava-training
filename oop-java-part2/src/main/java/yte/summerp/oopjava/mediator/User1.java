package yte.summerp.oopjava.mediator;

public class User1 extends Participant {
	private String name;
	private YTEChatRoom chat;

	@Override
	public void sendMsg(String msg) {
		chat.showMsg(msg,this);

	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	public User1(YTEChatRoom chat){
		this.chat=chat;
	}

}
