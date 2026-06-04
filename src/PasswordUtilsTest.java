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

    
    @Test
    void testContainsTripleWhenPasswordDoesNotHaveTriple() {
        assertFalse(PasswordUtils.containsTriple("password"));
    }

    @Test
    void testContainsTripleWhenRepeatedCharactersAreNotInARow() {
        assertFalse(PasswordUtils.containsTriple("papapassword"));
    }

    @Test
    void testContainsTripleWithShortPassword() {
        assertFalse(PasswordUtils.containsTriple("aa"));
    }

    @Test
    void testCountSpecialCharactersWithNoSpecialCharacters() {
        assertEquals(0, PasswordUtils.countSpecialCharacters("abc123"));
    }

    @Test
    void testCountSpecialCharactersWithSomeSpecialCharacters() {
        assertEquals(3, PasswordUtils.countSpecialCharacters("abc!@#123"));
    }

    @Test
    void testCountSpecialCharactersWithSpaces() {
        assertEquals(2, PasswordUtils.countSpecialCharacters("hello world!"));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenEnough() {
        assertTrue(PasswordUtils.hasSufficientSpecialCharacters("abc!@#123", 3));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenExactlyMinimum() {
        assertTrue(PasswordUtils.hasSufficientSpecialCharacters("abc!123", 1));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenNotEnough() {
        assertFalse(PasswordUtils.hasSufficientSpecialCharacters("abc!123", 2));
    }

    
    @Test
    void testContainsTripleWhenPasswordDoesNotHaveTriple() {
        assertFalse(PasswordUtils.containsTriple("password"));
    }

    @Test
    void testContainsTripleWhenRepeatedCharactersAreNotInARow() {
        assertFalse(PasswordUtils.containsTriple("papapassword"));
    }

    @Test
    void testContainsTripleWithShortPassword() {
        assertFalse(PasswordUtils.containsTriple("aa"));
    }

    @Test
    void testCountSpecialCharactersWithNoSpecialCharacters() {
        assertEquals(0, PasswordUtils.countSpecialCharacters("abc123"));
    }

    @Test
    void testCountSpecialCharactersWithSomeSpecialCharacters() {
        assertEquals(3, PasswordUtils.countSpecialCharacters("abc!@#123"));
    }

    @Test
    void testCountSpecialCharactersWithSpaces() {
        assertEquals(2, PasswordUtils.countSpecialCharacters("hello world!"));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenEnough() {
        assertTrue(PasswordUtils.hasSufficientSpecialCharacters("abc!@#123", 3));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenExactlyMinimum() {
        assertTrue(PasswordUtils.hasSufficientSpecialCharacters("abc!123", 1));
    }

    @Test
    void testHasSufficientSpecialCharactersWhenNotEnough() {
        assertFalse(PasswordUtils.hasSufficientSpecialCharacters("abc!123", 2));
    }

}
