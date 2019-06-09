package cn.business_delegate.pattern.simple;

public class Client {

	BusinessDelegate  businessService;
	
	public Client(BusinessDelegate businessService) {
	
		this.businessService = businessService;
	}
	
	public void doTask() {
		businessService.doTask();
	}

}
