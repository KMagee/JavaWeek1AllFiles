package com.avaya;

import java.sql.*;

public class Main {

    // we are using derbyclient to connect to the network database server
    private static String protocol = "jdbc:derby://localhost:1527/";

    public static void main(String[] args) {
        System.out.println("Starting in client mode");
        makeConnection();
    }

    private static void makeConnection() {
        System.out.println("Creating connection");
        // some local variables
        Connection conn = null;
        Statement s;
        ResultSet rs = null;
        String dbName = "myDB"; // the name of the database

        String url = protocol + dbName + ";create=true";
        try {
            // make a connection
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to and created database " + dbName);

            // somewhere to put our statement instances
            s = conn.createStatement();

            // SQL statements
            String createTable = "CREATE TABLE MYTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))";
            String dropTable = "drop table MYTABLE";
            String insertData = "INSERT INTO MYTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')";
            String readData = "SELECT * FROM MYTABLE";
            String readFilteredData = "SELECT * FROM MYTABLE WHERE ID=20";

            // drop MYTABLE table if it already exists
            rs = conn.getMetaData().getTables(null, null, "MYTABLE", null);//Default schema name is "APP"
            if (rs.next()) {
                s.execute(dropTable);
            }

            // create a table
            System.out.println("Creating MYTABLE in the database");
            s.execute(createTable);

            // insert some data into the table
            System.out.println("Inserting some data into MYTABLE");
            s.execute(insertData);

            // read the data from the table
            System.out.println("Reading all the data from MYTABLE");
            rs = s.executeQuery(readData);
            while(rs.next()){
                System.out.println(rs.getInt(1));
            }

            // read some filtered data from the table
            System.out.println("Reading some filtered data from MYTABLE");
            rs = s.executeQuery(readFilteredData);
            while(rs.next()) {
                System.out.println(rs.getInt(1));
            }

            // delete the table
            System.out.println("Dropping MYTABLE from the database");
            s.execute(dropTable);
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
        finally {
            // clean up here
            try{
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
            }
            catch (SQLException sqle) {
                System.out.println(sqle);
            }
        }
    }
}