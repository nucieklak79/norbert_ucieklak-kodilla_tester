package com.kodilla.jdbc.homework;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DbHomeworkTestSuite {
    private DbHomework dbHomework;

    @BeforeEach
    void setup() throws SQLException {

        dbHomework = DbHomework.getInstance();
        assertNotNull(dbHomework.getConnection(), "Database connection shouldn't be null.");

        try (Statement statement = dbHomework.getConnection().createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS POSTS");
            statement.executeUpdate("DROP TABLE IF EXISTS USERS");
            System.out.println("Old tables (if exists) were deleted.");
        } catch (SQLException e) {
            System.err.println("Error while deleting old tables: " + e.getMessage());
            throw e;
        }

        try (Statement statement = dbHomework.getConnection().createStatement()) {
            String createUserTableSql = "CREATE TABLE USERS (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "firstname VARCHAR(255) NOT NULL," +
                    "lastname VARCHAR(255) NOT NULL" +
                    ");";
            statement.executeUpdate(createUserTableSql);
            System.out.println("USERS table was created.");

            String createPostsTableSql = "CREATE TABLE POSTS (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "user_id INT NOT NULL," +
                    "title VARCHAR(255) NOT NULL," +
                    "body TEXT," +
                    "FOREIGN KEY (user_id) REFERENCES USERS(id)" +
                    ");";
            statement.executeUpdate(createPostsTableSql);
            System.out.println("POSTS table was created.");
        } catch (SQLException e) {
            System.err.println("Error while creating tables: " + e.getMessage());
            throw e;
        }

        try (Statement statement = dbHomework.getConnection().createStatement()) {

            statement.executeUpdate("INSERT INTO USERS (firstname, lastname) VALUES ('Jan', 'Kowalski')");
            statement.executeUpdate("INSERT INTO USERS (firstname, lastname) VALUES ('Marta', 'Mzyk')");
            statement.executeUpdate("INSERT INTO USERS (firstname, lastname) VALUES ('Norbert', 'Ucieklak')");
            statement.executeUpdate("INSERT INTO USERS (firstname, lastname) VALUES ('Robert', 'Lewandowski')");
            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (1, 'Name', 'My name is Jan')");
            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (1, 'Age', 'I'm 36 years old')");
            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (1, 'Car', 'My favorite car is Mazda')");

            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (2, 'Name', 'My name is Marta')");

            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (3, 'Name', 'My name is Norbert')");
            statement.executeUpdate("INSERT INTO POSTS (user_id, title, body) VALUES (3, 'Age', 'I'm 46 years old')");

        } catch (SQLException e) {
            System.err.println("Error while posting test data: " + e.getMessage());
            throw e;
        }
    }
    @AfterEach
    void tearDown() throws SQLException {
        try (Statement statement = dbHomework.getConnection().createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS POSTS");
            statement.executeUpdate("DROP TABLE IF EXISTS USERS");
            System.out.println("Test Tables were deleted.");
        } catch (SQLException e) {
            System.err.println("Error while deleting tables: " + e.getMessage());
        } finally {
            dbHomework.closeConnection();
        }
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {

        String sqlQuery = "SELECT u.firstname, u.lastname, COUNT(p.id) AS post_count " +
                "FROM USERS u JOIN POSTS p ON u.id = p.user_id " +
                "GROUP BY u.id, u.firstname, u.lastname " +
                "HAVING COUNT(p.id) >= 2";

        List<String> usersWithTwoOrMorePosts = new ArrayList<>();
        int actualRecordCount = 0;

        try (ResultSet rs = dbHomework.executeQuery(sqlQuery)) {
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int postCount = rs.getInt("post_count");
                System.out.println("First name: " + firstname + ", Surname: " + lastname + ", Number of posts: " + postCount);
                usersWithTwoOrMorePosts.add(firstname + " " + lastname);
                actualRecordCount++;
            }
            System.out.println("----------------------------------------------");
        } catch (SQLException e) {
            System.err.println("Request error: " + e.getMessage());
            throw e;
        }

        int expectedRecordCount = 2;
        assertEquals(expectedRecordCount, actualRecordCount);
        assertTrue(usersWithTwoOrMorePosts.contains("Jan Kowalski"));
        assertTrue(usersWithTwoOrMorePosts.contains("Norbert Ucieklak"));
        assertEquals(expectedRecordCount, usersWithTwoOrMorePosts.size());
    }
}
