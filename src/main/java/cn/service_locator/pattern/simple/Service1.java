package cn.service_locator.pattern.simple;

public class Service1 implements Service {



	public String getName() {
		
		return "Service1";
	}

	public void execute() {
	
		System.out.println("Executing Service1");
	
	}

}
