package cn.business_delegate.pattern.simple;

public class EJBService implements BusinessService {



	public void doProcessing() {
		
		System.out.println("Processing task by invoking EJB Service");;
	}

}
