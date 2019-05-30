package yte.summerp.oopjava.command;

public class CommandException extends Exception {
	public CommandException(String message) {
		super(message);
	}

	public CommandException(String message,Throwable ex) {
		super(message,ex);
	}
}
