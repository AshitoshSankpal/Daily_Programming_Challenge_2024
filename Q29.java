import java.util.Scanner;
public class Q29 {
   



    
    public static int fibonacci(int n) {
    
        int[] dp = new int[n + 1];

       
        dp[0] = 0;
        if (n > 0) {
            dp[1] = 1;
        }

        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

      
        return dp[n];
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        
        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
        
        scanner.close();
    }
}

    

