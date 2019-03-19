/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gssteam2;
import java.sql.* ;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class arraylist {
    
  java.sql.Connection con = null;
      PreparedStatement pst = null;

//Replace this Shit
      String driver = "com.mysql.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/foodDatabase?useSSL=false";
   
   String username = "root";
   String password = "gssteam2";
   Class.forName(driver);
   
   Connection conn = DriverManager.getConnection(url,username,password);
String query = "SELECT max(key) FROM {name of your table} ";
        Statement stmt = con.createStatement();
  ResultSet rs = stmt.executeQuery(query);
int n = rs.getInt("max(key)");

ArrayList<Integer> Breakfast = new ArrayList<Integer>();
ArrayList<Integer> Lunch = new ArrayList<Integer>();
ArrayList<Integer> Dinner = new ArrayList<Integer>();


for (int i=0; i<n; i++){


String query1 = "SELECT  meal_category  FROM {Your Table Name } WHERE {Whatever your primary key is} = "+ i;
rs = stmt.executeQuery(query1);	
String type = rs.getString("meal_category");

String query2 = "SELECT  bgr  FROM {Your Table Name } WHERE {Whatever your primary key is} = "+ i;
  rs = stmt.executeQuery(query2);	
int valuetosave = rs.getInt("bgr");


if (type.equalsIgnoreCase("Breakfast")){
Breakfast.add(valuetosave);

}

else if (type.equalsIgnoreCase("Lunch")){

Lunch.add(valuetosave);
}

else if (type.equalsIgnoreCase("Dinner")){
Dinner.add(valuetosave);
}

else{

//You've really fucked up if you ended up here

}
con.close();
    
    
}
}
