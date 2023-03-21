/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
public class DatabaseSetup extends DatabaseIO {
    public static void createTable() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        
 	Statement stmt = createConnection();
            String sql;
            sql = "CREATE TABLE IF NOT EXISTS trades " +
                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                    " sourceCurrencyCode VARCHAR(255), " + 
                    " destinationCurrencyCode VARCHAR(255), " + 
                    " tradeAmount INTEGER, " + 
                    " tradePrice DOUBLE, " + 
                    " PRIMARY KEY ( id ));"; 
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        
    }
}
