package cn.composite_entity.pattern.simple;

public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Client client = new Client();

		client.setData("Test", "Data");
		client.printData();

		client.setData("Second Test", "Data2");
		client.printData();
	}
}
