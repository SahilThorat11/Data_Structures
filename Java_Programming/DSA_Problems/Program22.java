// P22 - Coin Change (Minimum coins, DP)
import java.util.Arrays;

class Program22 
{
    static int coinChange(int[] coins, int amount) 
    {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++)
        {
            for (int c : coins)
            {
                if (c <= i)
                {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) 
    {
        int[] coins = {1, 5, 6, 9};
        int amount = 11;
        System.out.println("Min coins for " + amount + ": " + coinChange(coins, amount));
    }
}
