class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        result = self.dfs(x, abs(n))
        if n>=0:
            return result
        else:
            return 1.0/result
    
    def dfs(self, x, n):
        if n == 0:
            return 1.0;
        value = self.dfs(x, n/2)
        if n%2==0:
            return value * value
        else:
            return value * value * x