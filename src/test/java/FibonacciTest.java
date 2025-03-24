import org.emp.gl.Fibonacci;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class FibonacciTest {

    // Tests pour les valeurs standard
    @Test
    void fibonacciOfZeroShouldBeZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacciOfOneShouldBeOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacciOfFiveShouldBeFive() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    void fibonacciOfTenShouldBeFiftyFive() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    // Test paramétré pour plusieurs valeurs
    @ParameterizedTest(name = "fibonacci({0}) should be {1}")
    @MethodSource("fibonacciProvider")
    void testFibonacciWithParameters(int input, int expected) {
        assertEquals(expected, Fibonacci.fibonacci(input));
    }

    private static Stream<Arguments> fibonacciProvider() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(6, 8),
                Arguments.of(7, 13),
                Arguments.of(8, 21),
                Arguments.of(9, 34)
        );
    }

    // Test pour les cas d'erreur
    @Test
    void fibonacciOfNegativeShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, -5, -1})
    void fibonacciOfNegativeNumbersShouldThrowException(int negativeNumber) {
        assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.fibonacci(negativeNumber),
                "n must be positive");
    }

    // Test de performance (optionnel)
    @Test
    void fibonacciOfTwentyShouldBeFastEnough() {
        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> assertEquals(6765, Fibonacci.fibonacci(20))
        );
    }
}