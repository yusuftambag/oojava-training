package yte.summerp.oopjava.command;

public abstract class AbstractCommand implements Command {
	private boolean aborted=false;
	private boolean finished=false;
	private boolean success=false;
	private StringBuffer resultBuffer=new StringBuffer();

	@Override
	public synchronized CommandResult abort() throws CommandException {
		aborted = true;
		while (!finished) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		notify();
		if(!success)
			return new CommandResult(ExecutionStatus.ABORTED,"Execution aborted...");
		else
			return new CommandResult(ExecutionStatus.SUCCESS,"Execution abort failed!!, Result: "+resultBuffer.toString());
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public boolean isAborted() {
		return aborted;
	}

	public void append(String str) {
		resultBuffer.append(str);
	}

	public StringBuffer getResultBuffer() {
		return resultBuffer;
	}
}
