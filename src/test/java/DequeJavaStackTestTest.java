import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DequeJavaStackTestTest {

    @Test
    @DisplayName("test() should return non-null Deque with correct stack elements")
    void testStackOutput() {
        Deque<String> result = DequeJavaStackTest.test();

        assertNotNull(result, "The returned Deque should not be null");
        assertEquals(2, result.size(), "The Deque size should be 2 after stack operations");
        assertIterableEquals(List.of("N", "U"), result, "The Deque should contain ['N', 'U'] in order");
    }

    @Test
    @DisplayName("test() should maintain correct element values and ordering")
    void testStackOrder() {
        Deque<String> result = DequeJavaStackTest.test();

        assertEquals("N", result.peekFirst(), "First element should be 'N'");
        assertEquals("U", result.peekLast(), "Last element should be 'U'");
    }
}
