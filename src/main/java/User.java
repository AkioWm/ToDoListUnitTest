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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidPassword(){
        return  this.password.length() >= 8
                && this.password.length() <= 40;
    }
    public boolean isValid() {
        return EmailValidator.getInstance().isValid(this.email)
                && StringUtils.isNotBlank(this.firstName)
                && StringUtils.isNotBlank(this.lastName)
                && this.birthDate != null
                && StringUtils.isNotBlank(this.password)
                && isValidPassword()
                && LocalDate.now().minusYears(13).isAfter(this.birthDate);
    }
}
