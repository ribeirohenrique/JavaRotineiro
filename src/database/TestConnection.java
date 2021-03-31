//STEP 1. Import required packages
package database;

import java.sql.*;

public class TestConnection {
    //JDBC driver name and database URL
    private static String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private String DB_URL = "jdbc:mariadb://192.168.15.197/";

    //Database credentials
    private String USER = "developer";
    private String PASS = "RaspberryDatabaseMaria";

    public String getDB_URL() {
        return DB_URL;
    }

    public void setDB_URL(String DB_URL) {
        this.DB_URL = DB_URL;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public void testConnection(String database) {
        //Somente testa a conexão com o banco de dados
        String databaseConn = DB_URL + database;

        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(databaseConn, USER, PASS);
            System.out.println("Connected database successfully...");

        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }//Handle errors for Class.forName
        finally {
            //finally block used to close resources
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

