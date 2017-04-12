
package controller;

import beans.ProcessStock.ProcessStockData;
import beans.ProcessStock.ProcessStockRequest;
import beans.ProcessStock.ProcessStockResponse;
import datarepository.StockServiceDAO;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Random;

@Path("/stocks")
public class StocksService {

    @Path("/processStock")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ProcessStockResponse postMessage(ProcessStockRequest processStockRequest) {
        List<ProcessStockData> buySellStocks = StockServiceDAO.processStocks(processStockRequest.getStock());

        ProcessStockResponse response = new ProcessStockResponse();
        response.setStock(buySellStocks);

        Random random = new Random();
        response.setTransactionID(Math.abs(random.nextInt()));

        return response;
    }
}
