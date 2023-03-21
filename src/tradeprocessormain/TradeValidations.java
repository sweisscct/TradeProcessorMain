/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

/**
 *
 * @author Sam
 */
public class TradeValidations {
    public static boolean numFields(String[] fields) {
        if (fields.length != 3) {
            System.out.println("Warning: Incorrect number of fields");
            return false;
        } 
        return true;
    }
    
    public static boolean currencyLength(String code) {
        if (code.length() != 6) {
            System.out.println("Warning: Trade currencies malformed");
            return false;
        }
        return true;
    }
    
    public static boolean validateTradeAmount(String tradeAmountString) {
        try {
            Integer.parseInt(tradeAmountString);
            return true;
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade amount not a valid integer");
             return false;
        }
       
    }
    
    public static boolean validateTradePrice(String tradePriceString) {
        try {
            Double.parseDouble(tradePriceString);
            return true;
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade price not a valid decimal");
             return false;
        } 
        
    }
}
