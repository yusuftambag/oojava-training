package yte.summerp.oopjava.command;

public class CommandRunnerThread extends Thread {
	public Command command;
	public boolean finished=false;
	public CommandResult executionResult;

	public CommandRunnerThread(Command command) {
		this.command = command;
	}

	public void run() {
		try {
			executionResult = command.execute();
		} catch (CommandException ex) {
			ex.printStackTrace();
		}
		finished = true;
	}

	public CommandResult getExecutionResult() {
		return executionResult;
	}

	public synchronized void waitForFinish() {
		while (!finished) {
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		notifyAll();
	}
}
