import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    // I want the user to log in if the right details are entered
    @Test
    void shouldLogin() {
        User testUser = new User("Trev", "Balatro123");
        assertTrue(testLogin(testUser.getUsername(), testUser.getPassword()));
    }

    // I want it to fail if the wrong username is entered
    @Test
    void shouldFailWithInvalidUsername() {
        assertFalse(testLogin("WrongUser", "Balatro123"));
    }

    // If the wrong password is entered, I want it to fail
    @Test
    void shouldFailWithInvalidPassword() {
        assertFalse(testLogin("Trev", "WrongPassword"));
    }

    // this is a method to mimic the logic behind logging in
    // Note: I had to set users within loginScript.java to PUBLIC in order to conduct the test,
    // I'll switch back **
    private boolean testLogin(String username, String password) {
        for (User user : LoginScript.users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}