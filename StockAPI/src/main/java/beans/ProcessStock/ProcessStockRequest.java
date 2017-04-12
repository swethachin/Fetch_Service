package beans.ProcessStock;

import java.util.List;

/**
 * Created by teju on 3/2/17.
 */
public class ProcessStockRequest {

    private List<ProcessStockData> stock;

    public ProcessStockRequest(List<ProcessStockData> stock) {
        this.stock = stock;
    }

    public ProcessStockRequest() {
    }

    public List<ProcessStockData> getStock() {
        return stock;
    }

    public void setStock(List<ProcessStockData> stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProcessStockRequest{" +
                "stock=" + stock +
                '}';
    }
}
