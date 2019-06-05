package cn.interpreter.pattern.simple;

public class OrExpression implements Expression {
	
	private Expression expr1 = null;
	private Expression expr2 = null;
	
	public OrExpression(Expression expr1,Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	public boolean interpret(String content) {
	
		return expr1.interpret(content) || expr2.interpret(content);
	}

}
