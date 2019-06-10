package cn.intercepting_filter.pattern.simple;

public class DebugFilter implements Filter {

	public void execute(String request) {
		System.out.println("request log:"+request);
	}

}
