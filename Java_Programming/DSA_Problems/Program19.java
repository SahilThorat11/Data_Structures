// P19 - 0/1 Knapsack (Dynamic Programming)
public class Program19 
{
    static int knapsack(int[] wt, int[] val, int W) 
    {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        for(int i = 1; i <= n; i++)
        {
            for (int w = 0; w <= W; w++) 
            {
                dp[i][w] = dp[i-1][w];
                if(wt[i-1] <= w)
                {
                    dp[i][w] = Math.max(dp[i][w], dp[i-1][w - wt[i-1]] + val[i-1]);
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) 
    {
        int[] weights = {1, 3, 4, 5};
        int[] values  = {1, 4, 5, 7};
        int capacity  = 7;
        System.out.println("Max value in Knapsack (capacity=" + capacity + "): "
                + knapsack(weights, values, capacity));
    }
}
