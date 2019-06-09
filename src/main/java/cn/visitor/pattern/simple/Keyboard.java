package cn.visitor.pattern.simple;

public class Keyboard implements ComputerPart {


	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
