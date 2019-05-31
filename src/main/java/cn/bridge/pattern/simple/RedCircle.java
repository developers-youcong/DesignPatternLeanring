package cn.bridge.pattern.simple;

public class RedCircle implements DrawAPI {

	public RedCircle() {
		// TODO Auto-generated constructor stub
	}

	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Circle [ color:red,radius:"+radius+",x:"+x+","+y+"]");
	}

}
