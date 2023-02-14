/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_pro;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class db {
    static java.sql.Connection con = null;
    public static java.sql.Connection getConnection(){
        
      
      
        try {
            
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dambadeniyashop?useSSL=false","root","1234");
          return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("e"); 
           return null;
        }
 
        
    }
    
}
