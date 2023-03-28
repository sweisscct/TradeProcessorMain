/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class ValidateTradeAmount implements ValidationInterface {
    @Override
    public boolean validateData(String[] fields) {
        try {
            Integer.parseInt(fields[1]);
            return true;
        } 
        catch (Exception e) {
             System.out.println("Warning: Trade amount not a valid integer");
             return false;
        }
    }
}
