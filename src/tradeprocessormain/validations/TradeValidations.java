/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class TradeValidations implements ValidationInterface {
    @Override
    public boolean validateData(String[] fields) {
        CompositeValidator validator = new CompositeValidator();
//        ValidationInterface numFields = new ValidateNumFields();
//        validator.addComponent(numFields);
//        validator.addComponent(new ValidateCurrencyLength());
//        validator.addComponent(new ValidateTradeAmount());
//        validator.addComponent(new ValidateTradePrices());
        
        String[] validations = {"numFields", "currencyLength", "tradeAmount", "tradePrice"};
        ValidationFactory vf = new ValidationFactory();
        for (String method : validations) {
            validator.addComponent(vf.createValidation(method));   
        }
        return validator.validateData(fields);
    }
    
   
    
//    public static boolean numFields(String[] fields) {
//        if (fields.length != 3) {
//            System.out.println("Warning: Incorrect number of fields");
//            return false;
//        } 
//        return true;
//    }
//    
//    public static boolean currencyLength(String code) {
//        if (code.length() != 6) {
//            System.out.println("Warning: Trade currencies malformed");
//            return false;
//        }
//        return true;
//    }
    
//    public static boolean validateTradeAmount(String tradeAmountString) {
//        try {
//            Integer.parseInt(tradeAmountString);
//            return true;
//        } 
//        catch (Exception e) {
//             System.out.println("Warning: Trade amount not a valid integer");
//             return false;
//        }
//    }
    /*
    Make a new class
    implement the ValidationInterface
    move the code over to the new class
    add the component to the CompositeValidator
    String tradePriceString = fields[2]
    */
//    public static boolean validateTradePrice(String tradePriceString) {
//        try {
//            Double.parseDouble(tradePriceString); // fields[2]
//            return true;
//        } 
//        catch (Exception e) {
//             System.out.println("Warning: Trade price not a valid decimal");
//             return false;
//        } 
//    }
}
