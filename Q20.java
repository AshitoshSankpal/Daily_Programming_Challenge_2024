import java.util.*;

public class Q20 {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int currentElement = stack.pop();
            sortStack(stack);
            insertSorted(stack, currentElement);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println("Sorted stack: " + stack);
    }
}
