package cn.builder.pattern.simple;

public class ChickenBurger extends Burger {

	public String name() {
		
		return "Chicken Burger";
	}

	@Override
	public float price() {
		
		return 50.5f;
	}

}
