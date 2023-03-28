/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import tradeprocessormain.validations.TradeValidations;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class TradeParser {
    public static TradeRecord parseTrades(String line) {
        String[] fields = line.split(",");
        boolean isValid = TradeValidations.numFields(fields) &&
        TradeValidations.currencyLength(fields[0]) &&
        TradeValidations.validateTradeAmount(fields[1]) &&
        TradeValidations.validateTradePrice(fields[2]);
        
        // true && true == true
        // true &7 false == false
        // false &7 true == false
        // false && false == false
        
        
            
        if (isValid)
        {
            String sourceCurrencyCode = fields[0].substring(0,3);
            String destinationCurrencyCode = fields[0].substring(3,6);
            int tradeAmount = Integer.parseInt(fields[1]);
            Double tradePrice = Double.parseDouble(fields[2]);
            TradeRecord trade = new TradeRecord(sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice);
            return trade;   
        }
        return null;
    }
}
