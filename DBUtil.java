package com.bank;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection conn = null;
    public static Connection getConnection() {
  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp","root","Sanika@123"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}