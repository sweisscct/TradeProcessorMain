/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

/**
 *
 * @author Sam
 */
public class ValidationFactory {
    public ValidationInterface createValidation(String type) {
        switch (type) {
            case "numFields":
                return new ValidateNumFields();
//                break;
            case "currencyLength":
                return new ValidateCurrencyLength();
            case "tradeAmount":
                return new ValidateTradeAmount();
            case "tradePrices":
                return new ValidateTradePrices();
            default:
                return null;
        }
                
    }
}
