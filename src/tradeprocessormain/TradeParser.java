/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class TradeParser {
    public static TradeRecord parseTrades(String line) {
        String[] fields = line.split(",");
        boolean isValid = TradeValidations.validateTrades(fields);
            
        if (isValid)
        {
            String sourceCurrencyCode = fields[0].substring(0,3);
            String destinationCurrencyCode = fields[0].substring(3,6);

            TradeRecord trade = new TradeRecord(sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice);
            trades.add(trade);   
        }
    }
}
