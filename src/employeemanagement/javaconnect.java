/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn = null;
    //ResultSet rs;
    //PreparedStatement pst;
    
    public static Connection ConnectDb(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           //Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_mgmt?zeroDateTimeBehavior=convertToNull","root","");
           Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_mgmt","root","");
           //JOptionPane.showMessageDialog(null,"Connected to Database");
           //System.out.println("Database Connected Successfully");
         return conn;   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           // System.out.println(e.getMessage());
            return null;
        }
        
    }
}
