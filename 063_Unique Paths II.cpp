class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int m = obstacleGrid.size();
        int n = obstacleGrid[0].size();
        
        vector<int> dp(n, 0);
        dp[0] = 1;
        
        for (int i=0;i<m;i++) {
            dp[0] = (obstacleGrid[i][0]==1 || dp[0]==0)?0:1;
            for (int j=1;j<n;j++) {
                if (obstacleGrid[i][j] == 0)
                    dp[j] += dp[j-1];
                else
                    dp[j] = 0;
            }
        }
        
        return dp[n-1];
    }
};