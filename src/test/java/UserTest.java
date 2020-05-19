import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private static User u;

    @BeforeAll
    public static void mySetup(){
        u = new User("0123456789012345678901234567890123456789","azezae@azez.fr","azertt","azezea",
                LocalDate.now().minusYears(20));
        assertTrue(u.isValid());
    }
    @Test
    void isValidNominalTest() {
        assertTrue(u.isValid());
    }
}
