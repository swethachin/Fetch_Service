package beans.ProcessStock;

import java.util.List;

/**
 * Created by teju on 3/2/17.
 */
public class ProcessStockResponse {

    private List<ProcessStockData> stock;
    private long transactionID;

    public ProcessStockResponse(List<ProcessStockData> stock, long transactionID) {
        this.stock = stock;
        this.transactionID = transactionID;
    }

    public ProcessStockResponse() {
    }

    public List<ProcessStockData> getStock() {
        return stock;
    }

    public void setStock(List<ProcessStockData> stock) {
        this.stock = stock;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public String toString() {
        return "ProcessStockResponse{" +
                "stock=" + stock +
                ", transactionID=" + transactionID +
                '}';
    }
}
