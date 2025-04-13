import com.kodilla.stream.UserManager;
import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.List;


public class UserManagerTest {
    @Test
    void testFilterChemistGroupUsernames() {
        // Given
        UserManager usersManager = new UserManager();

        // When
        List<String> result = usersManager.filterChemistGroupUsernames();

        // Then
        org.junit.jupiter.api.Assertions.assertEquals(2, result.size());
        org.junit.jupiter.api.Assertions.assertTrue(result.contains("Walter White"));
        org.junit.jupiter.api.Assertions.assertTrue(result.contains("Gale Boetticher"));

    }

    @Test
    void testFilterUsersOlderThan() {
        // Given
        UserManager usersManager = new UserManager();

        // When
        List<User> result = UserManager.filterOlderUsersThan(30);

        // Then
        org.junit.jupiter.api.Assertions.assertEquals(5, result.size());
        for (User user : result) {
            org.junit.jupiter.api.Assertions.assertTrue(user.getAge() > 30);
        }
    }

  

}
