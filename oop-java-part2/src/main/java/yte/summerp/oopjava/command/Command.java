package yte.summerp.oopjava.command;

public interface Command {
	public CommandResult execute() throws CommandException;

	public CommandResult abort() throws CommandException;
}
