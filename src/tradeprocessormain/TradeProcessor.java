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
    public void ProcessTrades() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        System.out.println("Start");
        // Delegated reading in the file
        List<String> lines = FileInput.inputData();
        List<TradeRecord> trades = new ArrayList<>();
        
        lines.forEach(line -> {
           TradeRecord trade = TradeParser.parseTrades(line);
           if (trade != null) {
               trades.add(trade);
           }
        });
        DatabaseSetup.createTable();
        DatabaseWriter.outputData(trades);
    }
}


    