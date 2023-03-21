/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class FileInput {
        public static List<String> inputData() throws FileNotFoundException, IOException {
            BufferedReader myReader = new BufferedReader(new FileReader("trades.csv"));
            List<String> lines = new ArrayList<>();
            String inputLine = myReader.readLine();
            while ((inputLine = myReader.readLine()) != null) {
                lines.add(inputLine);
            }   
            return lines;
        }
    
    
    

}
