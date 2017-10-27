import java.sql.*;

class PrintEmployees {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:personnel");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT name,salary FROM employee WHERE salary>20000 ORDER BY salary");

            while(res.next()) {
                String nam = res.getString("name");
                int sal = res.getInt("salary");
                System.out.print("Employee:"+nam);
                System.out.println("\t\tSalary: "+sal);
            }
        } catch (Exception e) {
            System.err.println("Error accessing personnel database: "+e.toString());
        }
    }
}

