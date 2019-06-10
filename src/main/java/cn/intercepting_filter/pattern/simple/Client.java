package cn.intercepting_filter.pattern.simple;

public class Client {

	FilterManager filterManger;
	
	public void setFilterManager(FilterManager filterManger) {
		
		this.filterManger = filterManger;
	}
	
	public void sendRequest(String request) {
		
		filterManger.filterRequest(request);
	}

}
