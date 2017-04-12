package datarepository;


import beans.ProcessStock.ProcessStockData;
import constants.StocksContants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StockServiceDAO {

    static int count = 0;

    public static List<ProcessStockData> processStocks(List<ProcessStockData> inputStocks) {

        List<ProcessStockData> stocks = new ArrayList<ProcessStockData>();
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {

            count++;
            connection = getConnection();
            preparedStatement = connection.prepareStatement(StocksContants.BUYSELL_STOCKS_QUERY);


            for (ProcessStockData inputStock : inputStocks) {
                preparedStatement.setString(1, inputStock.getId());
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String tickerId = resultSet.getString(StocksContants.TICKER);
                    long quantity = inputStock.getQuantity();
                    int counter = resultSet.getInt(StocksContants.COUNTER);
                    float price = resultSet.getFloat(StocksContants.PRICE);

                    double amount = 0;


                    if (inputStock.getCounter() == counter && count % 6 != 0) {
                        amount = Math.abs(price * quantity);
                    }

                    ProcessStockData stock =
                            new ProcessStockData(
                                    tickerId,
                                    quantity,
                                    inputStock.getCounter(),
                                    amount
                            );

                    stocks.add(stock);
                }

            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return stocks;
    }

    private static Connection getConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(StocksContants.DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(StocksContants.DB_CONNECTION, StocksContants.DB_USER,
                    StocksContants.DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }
}
