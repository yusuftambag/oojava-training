package yte.summerp.oopjava.command;

public class CommandRunner {
	public static void main(String argv[]) {
		WindowsCmdCommand windowsCmdCommand=new WindowsCmdCommand("C:\\Windows\\notepad.exe","D:\\parent-pom-0.0.2.pom");
		HttpRequestCommand httpRequestCommand = new HttpRequestCommand("http://www","GET",null);
		Command commands[]={windowsCmdCommand,httpRequestCommand};
		boolean first=true;
		try {
			for(Command command:commands) {
				CommandResult commandResult=command.execute();
				if(first) {
					first=false;
					CommandResult abortResult=command.abort();
					System.out.println("Abort Result: "+abortResult.getExecutionStatus()+" -> "+abortResult.getReturnMessage());
				}
				System.out.println(commandResult.getExecutionStatus()+" : "+commandResult.getReturnMessage());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
