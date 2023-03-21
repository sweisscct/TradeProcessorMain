/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tradeprocessormain;

/**
 *
 * @author Sam
 */
public class TradeProcessorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TradeProcessor tp = new TradeProcessor();
        try {
            tp.ProcessTrades();
        } catch (Exception e) {
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
    
}
