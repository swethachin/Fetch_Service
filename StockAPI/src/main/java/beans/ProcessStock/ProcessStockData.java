package beans.ProcessStock;

/**
 * Created by teju on 3/2/17.
 */
public class ProcessStockData {
    public ProcessStockData(String id, long quantity, long counter, double amount) {
        this.id = id;
        this.quantity = quantity;
        this.counter = counter;
        this.amount = amount;
    }

    public ProcessStockData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ProcessStockAPIResponse{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", counter=" + counter +
                ", amount=" + amount +
                '}';
    }

    private String id;
    private long quantity;
    private long counter;
    private double amount;
}
