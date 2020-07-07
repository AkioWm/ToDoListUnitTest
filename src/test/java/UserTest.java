import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static User validUser;

    @BeforeEach
    public void mySetup() {
        validUser = new User("0123456789012345678901234567890123456789", "azezae@azez.fr", "azertt", "azezea",
                LocalDate.now().minusYears(20));
    }

    @Test
    void isValidNominalUserTest() {
        assertTrue(validUser.isValid());
    }

    @Test
    void passwordLessThanHeight() {
        validUser.setPassword("121");
        assertFalse(validUser.isValid());
    }

    @Test
    void blankPass() {
        validUser.setPassword("");
        assertFalse(validUser.isValid());
    }

    @Test
    void blankEmail() {
        validUser.setEmail("");
        assertFalse(validUser.isValid());
    }
    @Test
    void unValidEmail() {
        validUser.setEmail("Akio@hotmail.zaerazrezar");
        assertFalse(validUser.isValid());
    }

    @Test
    void blankFirstName() {
        validUser.setFirstName("");
        assertFalse(validUser.isValid());
    }
    @Test
    void blankLastName() {
        validUser.setLastName("");
        assertFalse(validUser.isValid());
    }
    @Test
    void nullBirth() {
        validUser.setBirthDate(null);
        assertFalse(validUser.isValid());
    }
    @Test
    void tooYoung(){
        validUser.setBirthDate(LocalDate.now().minusYears(10));
        assertFalse(validUser.isValid());
    }

}
