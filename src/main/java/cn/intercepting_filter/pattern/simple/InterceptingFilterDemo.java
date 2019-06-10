package cn.intercepting_filter.pattern.simple;

public class InterceptingFilterDemo {

public static void main(String[] args) {
	FilterManager filterManger = new FilterManager(new Target());
	filterManger.setFilter(new AuthenticationFilter());
	filterManger.setFilter(new DebugFilter());
	
	Client client = new Client();
	client.setFilterManager(filterManger);
	client.sendRequest("HOME");
}

}
