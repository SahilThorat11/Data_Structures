// P20 - Longest Common Subsequence (DP)
class Program20 
{
    static int lcs(String s1, String s2) 
    {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                dp[i][j] = (s1.charAt(i-1) == s2.charAt(j-1))
                        ? dp[i-1][j-1] + 1
                        : Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB", s2 = "GXTXAYB";
        System.out.println("LCS of \"" + s1 + "\" and \"" + s2 + "\": " + lcs(s1, s2));
    }
}
