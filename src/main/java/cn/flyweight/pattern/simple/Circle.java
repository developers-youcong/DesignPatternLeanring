package cn.flyweight.pattern.simple;

public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int redius;
	
	public Circle(String color) {
		this.color = color;
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getRedius() {
		return redius;
	}


	public void setRedius(int redius) {
		this.redius = redius;
	}


	public void draw() {
		System.out.println("Circle:Draw()[Color:"+color+",x:"+x+",y:"+y+",radius:"+redius);
	}

}
