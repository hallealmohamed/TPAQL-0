import org.emp.gl.Prime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class PrimeTest {

    // Tests pour les nombres non premiers
    @Test
    void isPrimeShouldReturnFalseForNumbersLessThan2() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(-5));
    }

    // Tests pour les nombres premiers
    @Test
    void isPrimeShouldReturnTrueForPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
    }

    // Tests pour les nombres non premiers
    @Test
    void isPrimeShouldReturnFalseForNonPrimeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(10));
        assertFalse(Prime.isPrime(15));
    }

    // Test paramétré pour plusieurs valeurs
    @ParameterizedTest
    @MethodSource("primeNumberProvider")
    void testIsPrimeWithParameters(int number, boolean expected) {
        assertEquals(expected, Prime.isPrime(number));
    }

    private static Stream<Arguments> primeNumberProvider() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(3, true),
                Arguments.of(4, false),
                Arguments.of(5, true),
                Arguments.of(6, false),
                Arguments.of(7, true),
                Arguments.of(8, false),
                Arguments.of(9, false),
                Arguments.of(10, false),
                Arguments.of(11, true),
                Arguments.of(12, false),
                Arguments.of(13, true),
                Arguments.of(14, false),
                Arguments.of(15, false),
                Arguments.of(16, false),
                Arguments.of(17, true)
        );
    }

    // Test pour un grand nombre premier (optionnel)
    @Test
    void isPrimeShouldReturnTrueForLargePrimeNumber() {
        assertTrue(Prime.isPrime(7919)); // 7919 est un nombre premier
    }

    // Test pour un grand nombre non premier (optionnel)
    @Test
    void isPrimeShouldReturnFalseForLargeNonPrimeNumber() {
        assertFalse(Prime.isPrime(7920)); // 7920 = 7919 + 1
    }
}