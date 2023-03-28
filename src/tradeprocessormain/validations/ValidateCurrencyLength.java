/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class ValidateCurrencyLength implements ValidationInterface {
    @Override
    public boolean validateData(String[] fields){
            if (fields[0].length() != 6) {
            System.out.println("Warning: Trade currencies malformed");
            return false;
        }
        return true;
    }
}
