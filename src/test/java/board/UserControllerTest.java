package board;

import Service.UserService;
import controller.UserController;
import entitiy.User;
import org.junit.Test;

public class UserControllerTest {

    private UserService userService;
    private UserController userController;


    @Test
    public void testCreateUser() {
        // Given
        User user = new User();

        // When
        userController.createUser();

//        Then
//        assertEquals(userService.getUsers().size(), 1);
    }

    @Test
    public void testDeleteUser() {
        // Given
        User user = new User();
        userService.createuser();

        // When
        userController.deleteUser(user);

        // Then
//        assertEquals(userService.getUsers().size(), 0);
    }
}
