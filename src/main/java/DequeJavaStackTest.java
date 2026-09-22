import java.util.Deque;
import java.util.ArrayDeque;

public final class DequeJavaStackTest {

    // 1. Private constructor prevents instantiation from within and outside the class
    private DequeJavaStackTest() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static Deque<String> test() {
        Deque<String> S = new ArrayDeque<>();  // contents: ()
        String returnItem;

        // TODO: put in Java Deque functions equivalent
        // to the stack example in Participation Activity 6.1.1
        // in the Zybook text
        // Use addLast and removeLast


        // Now print the final deque
        // Now convert to String and print
        String dequeString = S.toString();
        System.out.println("\nFinal deque is: " + dequeString);
        return S;
    }

    public static void main (String[] args) {
        test();
    }
}
