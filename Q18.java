import java.util.*;

public class Q18 {

   

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
          
            System.out.print("Enter a positive integer N: ");
            int N = scanner.nextInt();
    
            int divisorCount = 0;
    
          
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    divisorCount++;
                }
            }
    
            
            System.out.println("Total number of divisors of " + N + " is: " + divisorCount);
            
            scanner.close();
        }
    }
    

    

