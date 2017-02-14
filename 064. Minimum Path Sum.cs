public class Solution {
    public int MinPathSum(int[,] grid) {
        
        var dp = new int[grid.GetLength(1)];
        dp[0] = grid[0,0];
        for (int i=1;i<grid.GetLength(1);i++)
            dp[i] = dp[i-1] + grid[0,i];
        for (int i=1; i<grid.GetLength(0);i++) {
            for (int j=0;j<grid.GetLength(1);j++) {
                if (j == 0)
                    dp[j] += grid[i,j];
                else
                    dp[j] = grid[i,j] + Math.Min(dp[j-1], dp[j]);
            }
        }
        return dp[grid.GetLength(1)-1];
    }
}