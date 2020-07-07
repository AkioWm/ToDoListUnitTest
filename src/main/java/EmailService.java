import java.time.LocalDate;


public class EmailService {

    public static boolean send(User u) {
        return LocalDate.now().minusYears(18).isAfter(u.getBirthDate());
    }

}
