/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gssteam2;

/**
 *
 * @author Yashwee
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class Gssteam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         getConnection();
         
         new userJFrame().setVisible(true);
        
         
         
         
    }
 public static Connection getConnection() throws Exception{
  try{
   String driver = "com.mysql.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/foodDatabase?useSSL=false";
   
   String username = "root";
   String password = "gssteam2";
   Class.forName(driver);
   
   Connection conn = DriverManager.getConnection(url,username,password);
   System.out.println("Connected");
   return conn;
  } catch(Exception e){System.out.println(e);}
  
  
  return null;
 }
 
 
    
}

