class Solution(object):
    def totalNQueens(self, n):
        """
        :type n: int
        :rtype: int
        """
        self.col = [False] * n
        self.diag = [False] * (n *2)
        self.anti_diag = [False] * (n*2)
        self.result = 0
        
        self.dfs(0, n, [])
        return self.result
    
    def dfs(self, row, n, answer):
        if row == n:
            self.result += 1
            return
        for i in range(n):
            if not self.col[i] and not self.diag[row + i] and not self.anti_diag[n+row-i]:
                self.col[i] = self.diag[row + i] = self.anti_diag[n+row-i] = True
                self.dfs(row+1, n, answer+[i])
                self.col[i] = self.diag[row + i] = self.anti_diag[n+row-i] = False
        