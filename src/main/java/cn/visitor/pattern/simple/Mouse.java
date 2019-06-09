package cn.visitor.pattern.simple;

public class Mouse implements ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor) {
	
		computerPartVisitor.visit(this);
	}



}
