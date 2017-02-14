class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return 0
        
        minStep = 1
        start = 0
        end = nums[0]
        
        while end < len(nums)-1 : 
            curEnd = end
            for i in range(start, end+1):
                curEnd = max(curEnd, nums[i]+i)
            minStep = minStep + 1
            start = end + 1
            end = curEnd
        
        return minStep
        
        