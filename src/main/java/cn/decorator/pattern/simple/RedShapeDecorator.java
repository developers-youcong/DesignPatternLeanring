package cn.decorator.pattern.simple;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		
	}
	
	
	public void draw() {
		decoratedShape.draw();
		
		setRedBorder(decoratedShape);
	}
	
	
	private void setRedBorder(Shape decoratorShape) {
		
		System.out.println("Border Color:Red");
	}

}
