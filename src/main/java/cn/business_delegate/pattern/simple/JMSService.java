package cn.business_delegate.pattern.simple;

public class JMSService implements BusinessService {


	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");;
	}

}
