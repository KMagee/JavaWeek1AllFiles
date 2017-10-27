package com.avaya;

import java.sql.*;

// we need to import java sql utilities
//connect to the derby network server (as a client) client of derby server
//External Libraries do not come with java. Added external library derbyclient, we are the client of the derby server.


public class Main {

    private static String protocol = "jdbc:derby://localhost:1527/";
    //java database connectivity protocol
    // database type
    //localhost -- server
    //port number

    public static void main(String[] args) {


        //variables...object instances?
        //Classes are singletons so you do not need to create 'new' objects of it, like a String
        Connection conn = null; //static, singletons -- only need one. Only use the "new" keyword if you are creating a lot of different instances
        Statement s;
        ResultSet rs = null;
        String dbName = "myDB";
        String url = protocol + dbName + ";create=true";

        //;create=true"; means create if doesnt exist, otherwise use the existing


       //must have try/catch when connecting to a db
        try{

            //create a connection object
             conn = DriverManager.getConnection(url); //establish connection // capital letter DriverManager - using the singleton
             s = conn.createStatement(); //sql stmt
             String createTable = "CREATE TABLE MYTABLE(ID INT PRIMARY KEY, NAME VARCHAR(12))";
             String insertData = "INSERT INTO MYTABLE VALUES (10,'TEN'),(20, 'TWENTY'),(30,'THIRTY'),(40,'FORTY')";
             String readData = "SELECT * FROM MYTABLE";
             String dropTable = "DROP TABLE MYTABLE";

             //execute sql statements
           s.execute(createTable);
            s.execute(insertData);
            s.execute(readData);
            rs = s.executeQuery(readData);
            while (rs.next()){
                System.out.println("ID: "+ rs.getInt("ID") + "\tName: " + (rs.getString("Name")));
            }

            //drop the table
            s.execute(dropTable);

        }
        catch(SQLException sqle){

            System.out.println(sqle);
        }
        finally {

        }

    }
}
