/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;
import java.sql.*;


public class Connectiond {
 java.sql.Connection c;
    Statement s;
   
  public  Connectiond(){
    
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");    
            s =c.createStatement(); 
           
        }catch(Exception e){ 
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new Connectiond();
    }
}
