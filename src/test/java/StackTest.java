import org.emp.gl.Stack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    // Test 1: Nouvelle pile doit être vide
    @Test
    void newStackShouldBeEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    // Test 2: Push doit augmenter la taille
    @Test
    void pushShouldIncreaseSize() {
        Stack stack = new Stack();
        stack.push(10);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
    }

    // Test 3: Pop doit retourner le dernier élément et diminuer la taille
    @Test
    void popShouldReturnLastElementAndDecreaseSize() {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(20, stack.peek());
    }

    // Test 4: Peek doit retourner le dernier élément sans modifier la taille
    @Test
    void peekShouldReturnLastElementWithoutRemoving() {
        Stack stack = new Stack();
        stack.push(40);
        stack.push(50);

        assertEquals(50, stack.peek());
        assertEquals(2, stack.size());
    }

    // Test 5: Pop sur pile vide doit lancer une exception
    @Test
    void popOnEmptyStackShouldThrowException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    // Test 6: Peek sur pile vide doit lancer une exception
    @Test
    void peekOnEmptyStackShouldThrowException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    // Test 7: La pile doit s'agrandir automatiquement quand elle est pleine
    @Test
    void stackShouldExpandWhenFull() {
        Stack stack = new Stack();

        // Remplir la pile au-delà de sa capacité initiale (10)
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());
    }

    // Test paramétré: Test des opérations avec différentes valeurs
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 100})
    void stackOperationsShouldWorkWithVariousValues(int value) {
        Stack stack = new Stack();
        stack.push(value);
        assertEquals(value, stack.peek());
        assertEquals(value, stack.pop());
        assertTrue(stack.isEmpty());
    }

    // Test 8: Séquence complexe d'opérations
    @Test
    void complexOperationSequence() {
        Stack stack = new Stack();

        // Push plusieurs éléments
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        // Vérifier taille et sommet
        assertEquals(5, stack.size());
        assertEquals(4, stack.peek());

        // Pop deux éléments
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());

        // Vérifier taille et sommet après pop
        assertEquals(3, stack.size());
        assertEquals(2, stack.peek());

        // Push de nouveaux éléments
        stack.push(10);
        stack.push(20);

        // Vérifications finales
        assertEquals(5, stack.size());
        assertEquals(20, stack.peek());
    }
}