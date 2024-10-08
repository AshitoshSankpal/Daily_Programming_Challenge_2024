import java.util.Arrays;
import java.util.Scanner;
public class Q30 {
   



    
    public static int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount + 1];
        
        
        Arrays.fill(dp, amount + 1);
        
       
        dp[0] = 0;

        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of coin denominations: ");
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the coin denominations: ");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the total amount: ");
        int amount = scanner.nextInt();

       
        int result = coinChange(coins, amount);
        if (result != -1) {
            System.out.println("The minimum number of coins required: " + result);
        } else {
            System.out.println("It's not possible to make the amount with the given coins.");
        }

        scanner.close();
    }
}


