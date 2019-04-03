/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swift.upi;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author J.A.R.V.I.S
 */
public class DbConnect {
    public static Connection getConnection(){
        Connection con=null;
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/swiftdb","friday","atul1234@");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
         return con;
    }
}
