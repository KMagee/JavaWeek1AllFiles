// https://pastebin.com/TLKXiJuK

package com.avaya;

import java.sql.*;

public class ImageDB {

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
            String createTable = "CREATE TABLE IMAGETABLE " +
                    "( ID INT PRIMARY KEY, " +
                    "FILENAME VARCHAR(32), " +
                    "PHOTOGRAPHER VARCHAR(32), " +
                    "CATEGORY VARCHAR(32)," +
                    "DESCRIPTION VARCHAR(32) )";
            String insertData  = "INSERT INTO IMAGETABLE" +
                    " VALUES " +
                    " (1, 'animals01', 'Emily Kim', 'animals', 'some creature')," +
                    " (2, 'city02', 'Ada Long', 'city', 'some place')," +
                    " (3, 'people03', 'Fred Hoyle', 'people', 'some person')";
            String readData    = "SELECT * FROM IMAGETABLE";

            // execute SQL statements
            //s.execute(createTable);
            //s.execute(insertData);
            rs = s.executeQuery(readData);
            while (rs.next()){
                System.out.println("" + rs.getInt(1)
                        +"\t"+rs.getString(2)
                        +"\t"+rs.getString(3)
                        +"\t"+rs.getString(4)
                );
            }
        }
        catch(SQLException sqle) {
            System.out.println(sqle);
        }
        finally {

        }









    }
}
