package cn.visitor.pattern.simple;

public class Monitor implements ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}



}
