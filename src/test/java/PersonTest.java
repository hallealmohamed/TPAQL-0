import org.emp.gl.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameShouldReturnFirstNameSpaceLastName() {
        // Arrange
        Person person = new Person("Jean", "Dupont", 25);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Jean Dupont", fullName);
    }

    @Test
    void isAdultShouldReturnTrueWhenAgeIs18OrMore() {
        // Arrange
        Person adult = new Person("Jean", "Dupont", 18);
        Person minor = new Person("Marie", "Durand", 13);

        // Act & Assert
        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }

}