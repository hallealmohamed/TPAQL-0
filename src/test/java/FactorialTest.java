import org.emp.gl.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

class FactorialTest {
    @Test
    void factorialOfZeroShouldBeOne() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void factorialOfOneShouldBeOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void factorialOfFiveShouldBe120() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void factorialOfNegativeShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

    @ParameterizedTest
    @MethodSource("factorialProvider")
    void testFactorialWithParameters(int input, int expected) {
        assertEquals(expected, Factorial.factorial(input));
    }

    private static Stream<Arguments> factorialProvider() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120),
                Arguments.of(6, 720)
        );
    }
}