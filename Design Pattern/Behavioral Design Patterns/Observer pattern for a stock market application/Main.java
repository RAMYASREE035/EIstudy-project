public class Main {
    public static void main(String[] args) {
        Subject stockMarket = new Subject();

        StockObserver observer1 = new StockObserver("Observer 1");
        StockObserver observer2 = new StockObserver("Observer 2");

        stockMarket.addObserver(observer1);
        stockMarket.addObserver(observer2);

        stockMarket.notifyObservers("AAPL", 150.00);
        stockMarket.notifyObservers("GOOGL", 2700.00);
    }
}
