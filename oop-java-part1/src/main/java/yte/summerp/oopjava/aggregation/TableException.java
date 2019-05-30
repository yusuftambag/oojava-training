package yte.summerp.oopjava.aggregation;

public class TableException extends Exception {
	public TableException(String message) {
		super(message);
	}

	public TableException(String message,Throwable ex) {
		super(message,ex);
	}
}
