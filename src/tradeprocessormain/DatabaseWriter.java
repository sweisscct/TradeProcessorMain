/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import static tradeprocessormain.DatabaseIO.createConnection;

/**
 *
 * @author Sam
 */
public class DatabaseWriter extends DatabaseIO {
    public static void outputData(List<TradeRecord> trades) throws SQLException {
        Statement stmt = createConnection();
        for (TradeRecord trade : trades) {
                String sql = String.format("INSERT INTO trades (sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice) VALUES ('%s', '%s', %d, %f);",
                trade.getSourceCurrencyCode(), 
                trade.getDestinationCurrencyCode(), 
                trade.getTradeAmount(), 
                trade.getTradePrice());
                
                stmt.executeUpdate(sql);
        }
        System.out.println("Sucessful");
    }
}
