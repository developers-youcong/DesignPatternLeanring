package cn.intercepting_filter.pattern.simple;

public class Target {

	public void execute(String request) {
		
		System.out.println("Executing request:"+request);
	}
}
