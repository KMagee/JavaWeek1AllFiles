package com.avaya;

import java.sql.*;


public class Derby {

    private static String protocol = "jdbc:derby://localhost:1527/";

    public static void main(String[] args) {

        Connection conn = null;
        Statement s;
        ResultSet rs = null;

        String dbName = "imageDB";
        String url = protocol + dbName + ";create=true";


        try{

            //create a connection object
            conn = DriverManager.getConnection(url);
            s = conn.createStatement(); //sql stmt

            //CREATE STMT
            String createTable =
                    "CREATE TABLE IMAGES" +
                            "(ID INT PRIMARY KEY, " +
                            "FILENAME VARCHAR(32), " +
                            "CATEGORY VARCHAR(32)," +
                            "PHOTOGRAPHER VARCHAR(32), " +
                            "DESCRIPTION VARCHAR(100))";

            //INSERT
            String insertData = "INSERT INTO IMAGES VALUES " +
                    "(1,'nature18','nature','Vera Drake','Crab apple trees in bloom.')," +
                    "(2,'animals03','animals','Emily Kim','Chubby donkey looking for a friend.')," +
                    "(3,'people08','people','Lisa Traylor','Tulle veil with pearl accents.')," +
                    "(4,'nature10','nature','Sukiya Wang','Green blades of grass.')," +
                    "(5,'misc04','miscellaneous','David Hassoun','Thomas Edisons workshop.')," +
                    "(6,'abstract02','abstract','David Hassoun','Firedancer at midnight in downtown Denver.')," +
                    "(7,'city04','city','Emily Kim','Rooftops in Paris France.')," +
                    "(8,'nature16','nature','Trevor Hayes','Overgrown garden.')," +
                    "(9,'nature07','nature','Yolanda Adams','Sun through trees.')," +
                    "(10,'nature08','nature','Luca Buitoni','Trunk Bay. St. John U.S.V.I.')";


            String readData = "SELECT * FROM IMAGES";

            String dropTable = "DROP TABLE IMAGES";

            //execute sql statements

            s.execute(createTable);
           s.execute(insertData);
           s.execute(readData);
            rs = s.executeQuery(readData);
           while (rs.next()){
                System.out.println("ID: "+ rs.getInt("ID") + "\tFilename: " + rs.getString("Filename") + "\tCategory: " +
                        rs.getString("Category") + "\tPhotographer: " + rs.getString("Photographer")
                        + "\tDescription: " + rs.getString("Description"));
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
