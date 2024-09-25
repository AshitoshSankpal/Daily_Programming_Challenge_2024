import java.util.ArrayList;
import java.util.List;

public class Q17 {





    public static List<Integer> primeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        
       
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }
        
    
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }
        
        
        if (N > 2) {
            factors.add(N);
        }
        
        return factors;
    }

    public static void main(String[] args) {
        int N = 18; 
        
        List<Integer> result = primeFactors(N);
        System.out.println(result);  
    }
}

    

