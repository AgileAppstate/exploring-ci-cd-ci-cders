import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the HelloWorld class.
 */
public class HelloWorldTest {

    /**
     * Tests that getHelloWorld() returns the expected default greeting.
     */
    @Test
    public void testGetHelloWorld() {
        String result = HelloWorld.getHelloWorld();
        assertEquals("Hello World!", result);
    }

    /**
     * Tests that getHelloWorldName(String name) returns a personalized greeting
     * when a regular name is provided.
     */
    @Test
    public void testGetHelloWorldNameWithRegularName() {
        String result = HelloWorld.getHelloWorldName("Alice");
        assertEquals("Hello World, and Alice!", result);
    }

    /**
     * Tests that getHelloWorldName(String name) handles an empty string input
     * by appending it directly to the greeting.
     */
    @Test
    public void testGetHelloWorldNameWithEmptyString() {
        String result = HelloWorld.getHelloWorldName("");
        assertEquals("Hello World, and !", result);
    }

    /**
     * Tests that getHelloWorldName(String name) handles a null input
     * by converting it to the string "null" in the greeting.
     */
    @Test
    public void testGetHelloWorldNameWithNull() {
        String result = HelloWorld.getHelloWorldName(null);
        assertEquals("Hello World, and null!", result);
    }
}
