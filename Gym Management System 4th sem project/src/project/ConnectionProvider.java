/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package project;
import java.sql.*;

/**
 *
 * @author AAsus
 */
/*public class ConnectionProvider {

    /**
     *
     * @return
     */
    /*public static Connection getCon()
    {
        /*try
        {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriveManager.getConnection("jdbc:mysql://localhost:3306/gms","root","#kobebryant99");

            return con;

        }
        catch(ClassNotFoundException e)
        {
            return null;
        }*/
        /*try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }   
        catch (ClassNotFoundException e) 
        {
            System.out.println("Where is your MySQL JDBC Driver?");
            return null;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try 
        {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root", "#kobebryant99");
        } 
        catch (SQLException e) 
        {
            System.out.println("Connection Failed! Check output console");
            return null;
        }
        if (connection != null) 
        {
            System.out.println("You made it, take control your database now!");
        } 
        else 
        {
            System.out.println("Failed to make connection!");
        }
            return null;*/
        
 /*   }
}*/
package project;
import java.sql.*;
import java.sql.SQLException;

public class ConnectionProvider {

   

	/**
     *
     * @return
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
	public static Connection getCon() throws ClassNotFoundException, SQLException
    {
    	/*Class.forName("com.mysql.cj.jdbc");
        Connection con = DriveManager.getConnection("jdbc:mysql://localhost:3306/gms","root","#kobebryant99");
        return con;*/
     

        /*try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }   
        catch (ClassNotFoundException e) 
        {
            System.out.println("Where is your MySQL JDBC Driver?");
            return null;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try 
        {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root", "#kobebryant99");
        } 
        catch (SQLException e) 
        {
            System.out.println("Connection Failed! Check output console");
            return null;
        }
        if (connection != null) 
        {
            System.out.println("You made it, take control your database now!");
        } 
        else 
        {
            System.out.println("Failed to make connection!");
        }
            return null;*/
    	Connection con = null;
    	try
    	{
    			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "#kobebryant99");
    			if(con!=null)
    			{
    				System.out.println("database is connected");
    			}
    	} 
    	catch(Exception e)
    	{
    		System.out.println("not connected");
    	}
		return con;
    }
    
}

        
        
        
 