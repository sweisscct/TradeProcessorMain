/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class TradeProcessor {
    public void ProcessTrades() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("Start");
        // Delegated reading in the file
        List<String> lines = FileInput.inputData();
        
        List<TradeRecord> trades = new ArrayList<>();
        
        lines.forEach(line -> {
            boolean isValid = TradeValidations.validateTrades(line);
            
            if (isValid)
            {
                String sourceCurrencyCode = fields[0].substring(0,3);
                String destinationCurrencyCode = fields[0].substring(3,6);

                TradeRecord trade = new TradeRecord(sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice);
                trades.add(trade);   
            }            
 
        });
        
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String DB_URL = "jdbc:mysql://localhost/trades";
        String USER = "sam2022";
        String PASS = "sam2022";    
        
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           Statement stmt = conn.createStatement();
        ) {		
            String sql;
            sql = "CREATE TABLE IF NOT EXISTS trades " +
                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                    " sourceCurrencyCode VARCHAR(255), " + 
                    " destinationCurrencyCode VARCHAR(255), " + 
                    " tradeAmount INTEGER, " + 
                    " tradePrice DOUBLE, " + 
                    " PRIMARY KEY ( id ));"; 
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");  
            
            
            for (TradeRecord trade : trades) {
                    sql = String.format("INSERT INTO trades (sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice) VALUES ('%s', '%s', %d, %f);",
                    trade.sourceCurrencyCode, trade.destinationCurrencyCode, trade.tradeAmount, trade.tradePrice);
                    stmt.executeUpdate(sql);
            }
            System.out.println("Sucessful");

        } catch (SQLException e) {
            e.printStackTrace();        
        }        
    }
}

class TradeRecord { 
    String sourceCurrencyCode;
    String destinationCurrencyCode;
    int tradeAmount;
    double tradePrice;

    public TradeRecord(String sourceCurrencyCode, String destinationCurrencyCode, int tradeAmount, double tradePrice) {
        this.sourceCurrencyCode = sourceCurrencyCode;
        this.destinationCurrencyCode = destinationCurrencyCode;
        this.tradeAmount = tradeAmount;
        this.tradePrice = tradePrice;
    }
}
    