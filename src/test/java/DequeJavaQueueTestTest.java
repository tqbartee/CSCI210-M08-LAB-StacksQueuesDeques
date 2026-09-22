import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DequeJavaQueueTestTest {

    @Test
    @DisplayName("test() should return non-null Deque with correct queue elements")
    void testQueueOutput() {
        Deque<String> result = DequeJavaQueueTest.test();

        assertNotNull(result, "The returned Deque should not be null");
        assertEquals(3, result.size(), "The Deque size should be 3 after queue operations");
        assertIterableEquals(List.of("GRU", "JNB", "IST"), result, "The Deque should contain ['GRU', 'JNB', 'IST'] in order");
    }

    @Test
    @DisplayName("test() should maintain correct element values and ordering")
    void testQueueOrder() {
        Deque<String> result = DequeJavaQueueTest.test();

        assertEquals("GRU", result.peekFirst(), "First element should be 'GRU'");
        assertEquals("IST", result.peekLast(), "Last element should be 'IST'");
    }
}
