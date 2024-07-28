public class StockObserver implements Observer {
    private String observerName;

    public StockObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(observerName + " received update: " + stockSymbol + " is now " + stockPrice);
    }
}
