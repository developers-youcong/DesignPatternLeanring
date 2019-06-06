package cn.null_object.pattern.simple;

public class NullPatternDemo {

	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
		
		System.out.println("Customer2");
		
		System.out.println(customer1.getName());
		
		System.out.println(customer2.getName());
		
		System.out.println(customer3.getName());
		
		System.out.println(customer4.getName());
	}

}
