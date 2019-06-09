package cn.strategy.pattern.simple;

public class OperationSubstract implements Strategy {


	public int doOperation(int num1, int num2) {
		
		return num1 - num2;
	}

}
