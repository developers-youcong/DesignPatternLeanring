package cn.facade.pattern.simple;

public class FacadePatternDemo {

public static void main(String[] args) {
	ShapeMarker shapeMarker = new ShapeMarker();
	shapeMarker.drawCircle();
	shapeMarker.drawRectangle();
	shapeMarker.drawSquare();
	
}

}
