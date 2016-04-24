package com.acsk.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	public static Connection getConnection() {
        try  {
        	
        	String user = "root";
    	    String pass = "";
    	    String url = "jdbc:mysql://localhost/test";
    	    String conn = "com.mysql.jdbc.Driver";
    	    Class.forName(conn);
    	    Connection con= DriverManager.getConnection(url,user,pass);
            
            System.out.println("Connection succesful");
            return con;
        }
        catch(Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

     public static void close(Connection con) {
        try  {
            con.close();
        }
        catch(Exception ex) {
        }
    }
	
    }