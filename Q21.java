import java.util.Stack;

public class Q21 {

    
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, poppedElement);
        }
    }

    
    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int poppedElement = stack.pop();
            insertAtBottom(stack, element);
            stack.push(poppedElement);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(3);
        originalStack.push(1);
        originalStack.push(4);
        originalStack.push(2);

        System.out.println("Original stack: " + originalStack);
        reverseStack(originalStack);
        System.out.println("Reversed stack: " + originalStack);
    }
}
