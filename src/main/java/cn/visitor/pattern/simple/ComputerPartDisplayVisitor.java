package cn.visitor.pattern.simple;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
	
		System.out.println("Displaying Computer");
	}

	public void visit(Mouse mouse) {
		
		System.out.println("Displaying Mouse");
	}

	public void visit(Keyboard leyboard) {
		
		System.out.println("Displaying Keyboard");
	}

	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor");
	}

}
