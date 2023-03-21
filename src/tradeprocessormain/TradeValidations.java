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
    private static boolean numFields(String[] fields) {
        if (fields.length != 3) {
            System.out.println("Warning: Incorrect number of fields");
            return false;
        } 
        return true;
    }
    
    private static boolean currencyLength(String code) {
        if (code.length() != 6) {
            System.out.println("Warning: Trade currencies malformed");
            return false;
        }
        return true;
    }
    
    
    
    public static boolean validateTrades(String[] fields) {
        boolean isValid = true;
        isValid = isValid && numFields(fields);
        isValid = isValid && currencyLength(fields[0]);




        int tradeAmount = -1;
        try {
            tradeAmount = Integer.parseInt(fields[1]);
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade amount not a valid integer");
             isValid = false;
        }

        double tradePrice = -1;
        try {
            tradePrice = Double.parseDouble(fields[2]);
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade price not a valid decimal");
             isValid = false;
        }  
        return isValid;
    }
}
