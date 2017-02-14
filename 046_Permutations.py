class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []
        visited = [0 for x in range(0, len(nums))]
        self.dfs([], nums, results, visited)
        return results
    
    def dfs(self, current, nums, results, visited):
        if len(current) == len(nums):
            results.append(current + [])
            return
        for i, v in enumerate(nums):
            if visited[i] == 0:
                visited[i] = 1
                current.append(nums[i])
                self.dfs(current, nums, results, visited)
                visited[i] = 0
                current.pop()