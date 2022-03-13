import com.bridgelabz.EmailPatternValidationUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Write JUnit Parameterised Test to validate multiple entry for the Email Address.
 */

public class EmailPatternValidationTest {
    EmailPatternValidationUtil validationUtil = null;

    /**
     * Creating EmailPatternValidationUtil object and initializing it to validationUtil
     */
    @BeforeEach
    public void init() {
        validationUtil = new EmailPatternValidationUtil();
    }

    /**
     * Creating Parameterized test case which will take provideValidEmailIds as inputs
     * @param input each entry from provideValidEmailIds will be taken as input
     * @param expected argument value will be passed as expected
     */
    @ParameterizedTest
    @MethodSource("provideValidEmailIds")
    public void givenEmail_WhenValid_ShouldReturnTrue(String input, boolean expected) {
        boolean result = validationUtil.isValidEmail(input);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Creating Parameterized test case which will take provideInValidEmailIds as inputs
     * @param input each entry from provideInValidEmailIds will be taken as input
     * @param expected argument value will be passed as expected
     */
    @ParameterizedTest
    @MethodSource("provideInValidEmailIds")
    public void givenEmail_WhenInValid_ShouldReturnFalse(String input, boolean expected) {
        boolean result = validationUtil.isValidEmail(input);
        Assertions.assertEquals(expected, result);
    }

    /**
     * List of email Ids which are valid
     */
    private static Stream<Arguments> provideValidEmailIds() {
        return Stream.of(
                Arguments.of("abc@bridgelabz.co.in", true),
                Arguments.of("abc@yahoo.com", true),
                Arguments.of("abc-100@yahoo.com", true),
                Arguments.of("abc.100@yahoo.com", true),
                Arguments.of("abc111@abc.com", true),
                Arguments.of("aabc-100@abc.net", true),
                Arguments.of("abc-100@abc.net", true),
                Arguments.of("abc@1.com", true),
                Arguments.of("aabc@gmail.com.com", true),
                Arguments.of("abc.xyz@bridgelabz.co.in", true),
                Arguments.of("abc+100@gmail.com", true),
                Arguments.of("abc-xyz@bridgelabz.co", true)
        );
    }

    /**
     * List of InValid email Ids
     */
    private static Stream<Arguments> provideInValidEmailIds() {
        return Stream.of(
                Arguments.of("abc_bridgelabz.company56", false),
                Arguments.of("ab33c@_bridgel4abz*gooogle", false),
                Arguments.of("abc", false),
                Arguments.of("abc@.com.my", false),
                Arguments.of("abc123@gmail.a", false),
                Arguments.of("abc123@.com", false),
                Arguments.of("abc123@.com.com", false),
                Arguments.of(".abc@abc.com", false),
                Arguments.of("abc()*@gmail.com", false),
                Arguments.of("aabc@%*.com", false),
                Arguments.of("abc..2002@gmail.com", false),
                Arguments.of("abc.@gmail.com", false),
                Arguments.of("abc@abc@gmail..com", false),
                Arguments.of("abc@gmail.com.1a", false),
                Arguments.of("ab33c@_bridgel4abz*gooogle", false),
                Arguments.of("abc@gmail.com.aa.au", false)
        );
    }
}
