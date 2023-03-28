/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class ValidateNumFields implements ValidationInterface {
    @Override
    public boolean validateData(String[] fields) {
        if (fields.length != 3) {
            System.out.println("Warning: Incorrect number of fields");
            return false;
        } 
        return true;
    }
}
