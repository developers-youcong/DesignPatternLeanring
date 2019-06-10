package cn.service_locator.pattern.simple;

public class Service2 implements Service {

	public String getName() {
		
		return "Service";
	}

	public void execute() {
		System.out.println("Executing Service2");
	}

}
