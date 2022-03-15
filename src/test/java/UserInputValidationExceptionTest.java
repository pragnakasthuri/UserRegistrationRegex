import com.bridgelabz.UserInputValidationUtil;
import com.bridgelabz.exceptions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *Write JUnit Test to validate the User Entry for First Name,
 * Last Name, Email, Mobile, and Password.
 */

public class UserInputValidationExceptionTest {

    UserInputValidationUtil validationUtil = null;

    @BeforeEach
    public void init() {
        validationUtil = new UserInputValidationUtil();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = validationUtil.isValidFirstName("Pragna");
            Assertions.assertEquals(true, result);
        } catch (InvalidFirstNameException e) {
        }
    }

    @Test
    public void givenFirstName_WhenShort_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidFirstName("Pr");
        } catch (InvalidFirstNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WithSplChar_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidFirstName("Pr@gna");
        } catch (InvalidFirstNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WithNumber_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidFirstName("Pr12na");
        } catch (InvalidFirstNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = validationUtil.isValidLastName("Kasthuri");
        } catch (InvalidLastNameException e) {
            Assertions.assertEquals(true, result);
        }
    }

    @Test
    public void givenLastName_WhenShort_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidLastName("Ka");
        } catch (InvalidLastNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WithSplChar_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidLastName("K@sthuri");
        } catch (InvalidLastNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WithNumber_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidLastName("K23thu6i");
        } catch (InvalidLastNameException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = validationUtil.isValidEmail("kpragna.25@gmail.com");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals(true, result);
        }
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidEmail("Kpragna..675.gmail.com");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = validationUtil.isValidMobileNumber("91 9087654321");
        } catch (InvalidMobileNumberException e) {
            Assertions.assertEquals(true, result);
        }
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidMobileNumber("908765-4321908");
        } catch (InvalidMobileNumberException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = validationUtil.isValidPassword("P@ssw0rd");
        } catch (InvalidPasswordException e) {
            Assertions.assertEquals(true, result);
        }
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidPassword("hgsuyds5ndj@");
        } catch (InvalidPasswordException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = validationUtil.isValidPassword("bsdj@HhcsBB");
        } catch (InvalidPasswordException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldThrowException() {
        boolean result = false;
        try {
            result = validationUtil.isValidPassword("Pvhs5665vhj");
        } catch (InvalidPasswordException e) {
            Assertions.assertEquals("Please enter valid input.", e.getMessage());
        }
    }
}






