class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        dp = [[0 for y in range(n)] for x in range(m)]
        for x in range(m):
            for y in range(n):
                if x==0 or y==0:
                    dp[x][y] = 1
                else:
                    dp[x][y] = dp[x-1][y]+dp[x][y-1]
        return dp[m-1][n-1]
                