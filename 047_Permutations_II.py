class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        nums.sort()
        self.dfs([], nums, result)
        return result
    
    def dfs(self, current, nums, result):
        if not nums:
            result.append(current+[])
            return
        for i,v in enumerate(nums):
            if i>0 and nums[i] == nums[i-1]:continue
            current.append(nums[i])
            self.dfs(current, nums[:i]+nums[i+1:], result)
            current.pop()