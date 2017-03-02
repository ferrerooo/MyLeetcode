public class Solution {
    public int UniquePathsWithObstacles(int[,] obstacleGrid) {
        int m = obstacleGrid.GetLength(0);
        int n = obstacleGrid.GetLength(1);
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=0;i<m;i++) {
            dp[0] = (obstacleGrid[i,0] == 1 || dp[0] == 0) ? 0 : 1;
            for (int j=1; j<n; j++) {
                dp[j] = obstacleGrid[i,j] == 1? 0 : dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }
}