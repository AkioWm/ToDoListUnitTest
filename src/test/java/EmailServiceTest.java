import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.mail.MessagingException;
import java.time.LocalDate;

class EmailServiceTest {

    @Test
    void badUser() throws MessagingException {
        User u = new User("0123456789012345678901234567890123456789", "azezae@azez.fr", "azertt", "azezea",
                LocalDate.now().minusYears(15));
        assertFalse(EmailService.send(u));
    }

}
