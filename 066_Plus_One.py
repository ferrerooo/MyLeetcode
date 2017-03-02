class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        size = len(digits)
        
        for i in range(size-1, -1, -1) :
            if digits[i] + 1 < 10:
                digits[i] += 1
                break
            digits[i] = 0
            if i == 0:
                digits.insert(0, 1)
        return digits