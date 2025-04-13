package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserManagerTest {
    @Test
    void testFilterChemistGroupUsernames() {
        // Given
        UserManager usersManager = new UserManager();

        // When
        List<String> result = usersManager.filterChemistGroupUsernames();

        // Then
        assertEquals(2, result.size());
        assertTrue(result.contains("Walter White"));
        assertTrue(result.contains("Gale Boetticher"));

    }

    @Test
    void testFilterUsersOlderThan() {
        // Given
        UserManager usersManager = new UserManager();

        // When
        List<User> result = UserManager.filterOlderUsersThan(30);

        // Then
        assertEquals(5, result.size());
        for (User user : result) {
            assertTrue(user.getAge() > 30);
        }
    }



}
