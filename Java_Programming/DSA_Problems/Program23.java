// P23 - N-Queens Problem (Backtracking)
class Program23 
{
    static int N = 6;
    static int[] board = new int[N];
    static int solutions = 0;

    static boolean isSafe(int row, int col) 
    {
        for (int i = 0; i < row; i++) 
        {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row))
            {
                return false;
            }
        }
        return true;
    }

    static void solve(int row) 
    {
        if (row == N) 
        { 
            solutions++; 
            return; 
        }

        for (int col = 0; col < N; col++) 
        {
            if(isSafe(row, col)) 
            {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

    public static void main(String[] args) 
    {
        solve(0);
        System.out.println("N-Queens solutions for N=" + N + ": " + solutions);
    }
}
