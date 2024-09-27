import java.util.Stack;
public class Q19 {


   


    
    
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
       
        String[] tokens = expression.split("\\s+");
        
       
        for (String token : tokens) {
            
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } 
            
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    case "^":
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                }
            }
        }
        
      
        return stack.pop();
    }
    
   
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
       
        String expression = "3 4 2 * 1 5 - 2 3 ^ ^ / +";
        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result); 
    }
}


    

