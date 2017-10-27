package com.avaya;

// we need to import java sql utilities

// NB we also added derbyclient.jar as a library

import java.sql.*;

public class Main {

    private static String protocol = "jdbc:derby://localhost:1527/";

    public static void main(String[] args) {
        // connect to the Derby network server (as a client)
        Connection conn = null;
        Statement s;
        ResultSet  rs = null;
        String dbName = "myDB";
        String    url = protocol + dbName + ";create=true";

        try {
            // create a connection object
            conn = DriverManager.getConnection(url);
            // somewhere to put our SQL statements
            s = conn.createStatement();
            // declare some SQL statements
            String createTable = "CREATE TABLE MYTABLE ( ID INT PRIMARY KEY, NAME VARCHAR(12) )";
            String insertData  = "INSERT INTO MYTABLE VALUES (10, 'TEN'), (20, 'TWENTY'), (30, 'THIRTY')";
            String readData    = "SELECT * FROM MYTABLE";
            String dropTable   = "DROP TABLE MYTABLE";

            // execute SQL statements
            s.execute(createTable);
            s.execute(insertData);
            rs = s.executeQuery(readData);
            while (rs.next()){
                // get values as int, string etc.
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }

            // drop the table
            s.execute(dropTable);

        }
        catch(SQLException sqle) {
            System.out.println(sqle);
        }
        finally {

        }









    }
}
