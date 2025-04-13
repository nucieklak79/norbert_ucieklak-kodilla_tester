package com.kodilla.stream.homework;
import com.kodilla.stream.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    void testGetAveragePostsForOldUsers() {
        // Given
        List<User> testUsers = UserRepository.getUserList();

        // When
        double average = ForumStats.averagePostsForUsersAboveOrEqual40(testUsers);

        // Then
        assertEquals((7.0 + 0.0 + 2.0 + 0.0) / 4, average, 0.01);
    }

    @Test
    void testGetAveragePostsForYoungUsers() {
        // Given
        List<User> testUsers = UserRepository.getUserList();

        // When
        double average = ForumStats.averagePostsForUsersBelow40(testUsers);

        // Then
       assertEquals((4648 + 116) / 2, average, 0.01);
    }

}
