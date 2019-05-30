package yte.summerp.oopjava.command;

public class CommandResult {
	private ExecutionStatus executionStatus;
	private String returnMessage;

	public CommandResult(ExecutionStatus executionStatus,String returnMessage) {
		this.executionStatus = executionStatus;
		this.returnMessage = returnMessage;
	}

	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}

	public String getReturnMessage() {
		return returnMessage;
	}
}
