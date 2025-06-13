package com.kodilla.jdbc.homework;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHomework {
    private static DbHomework dbManagerInstance;
    private Connection conn;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USER = "admin";
    private static final String DB_PASS = "admin";
    private static final String DB_NAME = "kodilla_tester";
    // -------------------------------------------------------------

    private DbHomework() throws SQLException {
         conn = DriverManager.getConnection(DB_URL + DB_NAME, DB_USER, DB_PASS);
           }

    public static DbHomework getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbHomework();
        } else if (dbManagerInstance.getConnection().isClosed()) {
            dbManagerInstance = new DbHomework();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }

    public ResultSet executeQuery(String sqlQuery) throws SQLException {
        Statement statement = conn.createStatement();
        return statement.executeQuery(sqlQuery);
    }

    public int executeUpdate(String sqlQuery) throws SQLException {
        Statement statement = conn.createStatement();
        int rowsAffected = statement.executeUpdate(sqlQuery);
        statement.close();
        return rowsAffected;
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Database connection was closed!");
            } catch (SQLException e) {
                System.err.println("Error while disconnecting: " + e.getMessage());
            }
        }
    }
}
