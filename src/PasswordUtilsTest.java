import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
assertEquals("short", PasswordUtils.describePasswordLength("abcde"));
    }

    @Test
    void testDescribePasswordLengthMediumPassword() {
        assertEquals("medium", PasswordUtils.describePasswordLength("abcdef"));
        assertEquals("medium", PasswordUtils.describePasswordLength("abcdefghijk"));
    }

    @Test
    void testDescribePasswordLengthLongPassword() {
        assertEquals("long", PasswordUtils.describePasswordLength("abcdefghijkl"));
    }

    @Test
    void testIsAlphanumericWithOnlyLettersAndDigits() {
        assertTrue(PasswordUtils.isAlphanumeric("abc123"));
    }

    @Test
    void testIsAlphanumericWithSpecialCharacter() {
        assertFalse(PasswordUtils.isAlphanumeric("abc!123"));
    }

    @Test
    void testIsAlphanumericWithSpecialCharacterAtEnd() {
        assertFalse(PasswordUtils.isAlphanumeric("abc123!"));
    }

    @Test
    void testContainsTripleWhenPasswordHasThreeSameCharactersInARow() {
        assertTrue(PasswordUtils.containsTriple("paaasword"));
    }

    @Test
    void testContainsTripleWhenPasswordHasMoreThanThreeSameCharactersInARow() {
        assertTrue(PasswordUtils.containsTriple("heyyyy"));
    }

}
