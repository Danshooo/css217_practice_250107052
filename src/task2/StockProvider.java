package task2;

// Target Interface
public interface StockProvider {
    double getMarketPrice(String ticker);
    String getStatus(String ticker);
}