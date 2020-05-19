import org.apache.commons.validator.routines.EmailValidator;
import org.junit.platform.commons.util.StringUtils;

import java.time.LocalDate;


public class User {
    private String email;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String password;
    public User(String password,String email, String lastName, String firstName, LocalDate birthDate) {
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }
    public boolean isValidPassword(){
        return this.password.length() >= 8 && this.password.length() <= 40;
    }
    public boolean isValid() {
        return EmailValidator.getInstance().isValid(this.email)
                && StringUtils.isNotBlank(this.firstName)
                && StringUtils.isNotBlank(this.lastName)
                && birthDate != null
                && isValidPassword()
                && LocalDate.now().minusYears(13).isAfter(this.birthDate);
    }
}
