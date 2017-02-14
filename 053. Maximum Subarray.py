class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums is None or len(nums)==0:
            return 0
        maxSubArr = -sys.maxint-1
        maxLocal = -sys.maxint-1
        for num in nums:
            maxLocal = max(num, num+maxLocal)
            maxSubArr = max(maxSubArr, maxLocal)
        return maxSubArr