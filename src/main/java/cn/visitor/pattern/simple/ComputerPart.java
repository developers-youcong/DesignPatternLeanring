package cn.visitor.pattern.simple;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);

}
