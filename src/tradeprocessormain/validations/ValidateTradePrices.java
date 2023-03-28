/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class ValidateTradePrices implements ValidationInterface {
    @Override
    public boolean validateData(String[] fields) {
        try {
            Double.parseDouble(fields[2]); // fields[2]
            return true;
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade price not a valid decimal");
             return false;
        } 
    }
}
