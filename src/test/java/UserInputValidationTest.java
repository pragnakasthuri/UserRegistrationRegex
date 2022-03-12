import com.bridgelabz.UserInputValidationUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *Write JUnit Test to validate the User Entry for First Name,
 * Last Name, Email, Mobile, and Password.
 */

public class UserInputValidationTest {

    UserInputValidationUtil validationUtil = null;

    @BeforeEach
    public void init() {
        validationUtil = new UserInputValidationUtil();
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = validationUtil.isValidFirstName("Pragna");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        boolean result = validationUtil.isValidFirstName("Pr");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WithSplChar_ShouldReturnFalse() {
        boolean result = validationUtil.isValidFirstName("Pr@gna");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WithNumber_ShouldReturnFalse() {
        boolean result = validationUtil.isValidFirstName("Pr12na");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validationUtil.isValidLastName("Kasthuri");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        boolean result = validationUtil.isValidLastName("Ka");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WithSplChar_ShouldReturnFalse() {
        boolean result = validationUtil.isValidLastName("K@sthuri");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WithNumber_ShouldReturnFalse() {
        boolean result = validationUtil.isValidLastName("K23thu6i");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = validationUtil.isValidEmail("kpragna.25@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        boolean result = validationUtil.isValidEmail("Kpragna..675.gmail.com");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        boolean result = validationUtil.isValidMobileNumber("91 9087654321");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        boolean result = validationUtil.isValidMobileNumber("908765-4321908");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = validationUtil.isValidPassword("P@ssw0rd");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
        boolean result = validationUtil.isValidPassword("hgsuyds5ndj@");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
        boolean result = validationUtil.isValidPassword("bsdj@HhcsBB");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldReturnFalse() {
        boolean result = validationUtil.isValidFirstName("Pvhs5665vhj");
        Assertions.assertEquals(false, result);
    }
}






