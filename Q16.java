import java.util.*;
public class Q16 {
   


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

   
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter first number (N): ");
        int N = scanner.nextInt();
        
        System.out.print("Enter second number (M): ");
        int M = scanner.nextInt();
        
       
        int lcmResult = lcm(N, M);
        
       
        System.out.println("LCM of " + N + " and " + M + " is: " + lcmResult);
        
        scanner.close();
    }
}


