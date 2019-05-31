package cn.bridge.pattern.simple;

public class GreenCircle implements DrawAPI {

	public GreenCircle() {
		// TODO Auto-generated constructor stub
	}

	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Circle [ color:green,radius:"+radius+",x:"+x+","+y+"]");
	}

}
