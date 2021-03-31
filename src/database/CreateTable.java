package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable extends TestConnection {
    private String tableName;
    private String sqlStatement;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public void createNewTable(String database) {
        Connection conn = null;
        Statement stmt = null;
        String databaseConn = this.getDB_URL() + database;
        try {
            conn = DriverManager.getConnection(databaseConn, this.getUSER(), this.getPASS());
            //STEP 4: Execute a query
            Scanner table = new Scanner(System.in);
            System.out.print("Digite o nome da tabela: ");
            this.setTableName(table.nextLine());
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            //Dropa a tabela antes de criar
            String sql1 = "DROP TABLE IF EXISTS " + this.getTableName();
            stmt.executeUpdate(sql1);

            String sql2 = "CREATE TABLE IF NOT EXISTS " + this.getTableName()
                    + "(id INTEGER not NULL, "
                    + " name VARCHAR(255), "
                    + " city VARCHAR(255), "
                    + " age INTEGER, "
                    + " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql2);
            System.out.println("Created table in given database...");

        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }//Handle errors for Class.forName
        finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException ignored) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample
