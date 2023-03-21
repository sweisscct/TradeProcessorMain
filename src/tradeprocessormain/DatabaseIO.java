/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
public abstract class DatabaseIO {
//        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        static final String DB_URL = "jdbc:mysql://localhost/trades";
        static final String USER = "pooa";
        static final String PASS = "pooa";   
        
        public static Statement createConnection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                   Statement stmt = conn.createStatement();
                return stmt;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
}
