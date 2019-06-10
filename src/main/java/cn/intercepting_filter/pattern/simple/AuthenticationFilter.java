package cn.intercepting_filter.pattern.simple;

public class AuthenticationFilter implements Filter {



	public void execute(String request) {
		
		System.out.println("Authenticating request:"+request);
	}

}
