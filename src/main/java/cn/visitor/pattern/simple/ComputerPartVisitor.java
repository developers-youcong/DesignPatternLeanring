package cn.visitor.pattern.simple;

public interface ComputerPartVisitor {

	public void visit(Computer computer);
	
	public void visit(Mouse mouse);
	
	public void visit(Keyboard leyboard);
	
	public void visit(Monitor monitor);
}
