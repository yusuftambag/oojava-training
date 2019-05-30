package yte.summerp.oopjava.adapter;

public class CallRecord {
	private String callingNumber;
	private String caller;
	private String responder;
	private String description;

	public CallRecord(String callingNumber,String caller,String responder,String description) {
		this.callingNumber = callingNumber;
		this.caller = caller;
		this.responder = responder;
		this.description = description;
	}

	public String getCallingNumber() {
		return callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber=callingNumber;
	}

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller=caller;
	}

	public String getResponder() {
		return responder;
	}

	public void setResponder(String responder) {
		this.responder=responder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description=description;
	}
}
