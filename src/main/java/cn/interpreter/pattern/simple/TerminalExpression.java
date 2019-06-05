package cn.interpreter.pattern.simple;

public class TerminalExpression implements Expression {
	
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}

	public boolean interpret(String content) {
		
		if(content.contains(data)) {
			
			return true;
		}
		return false;
	}

}
