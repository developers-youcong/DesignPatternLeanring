package cn.command.pattern.simple;

public class CommandPatternDemo {

	public static void main(String[] args) {
		
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		
		SellStock sellStock = new SellStock(abcStock);
		
		Broker broker = new Broker();
	
		broker.tackBroker(buyStockOrder);
		broker.tackBroker(sellStock);
		broker.placeOrders();
		
		}

}
