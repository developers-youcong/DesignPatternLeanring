package cn.builder.pattern.simple;

public abstract class Burger implements Item {


	public Packing packing() {
		
		return new Wrapper();
	}

	public abstract float price() ;

}
