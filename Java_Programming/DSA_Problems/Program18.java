// P18 - Fibonacci: Recursion vs DP
class Program18 
{
    static long fibRecursive(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    static long fibDP(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }

        long[] dp = new long[n + 1];
        dp[0] = 0; dp[1] = 1;
        for(int i = 2; i <= n; i++) 
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) 
    {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") recursive: " + fibRecursive(n));
        System.out.println("Fibonacci(" + n + ") DP:        " + fibDP(n));
        System.out.print("First 10 Fibonacci: ");

        for(int i = 0; i < 10; i++) 
        {
            System.out.print(fibDP(i) + " ");
        }
    }
}
