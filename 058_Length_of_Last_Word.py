class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # return len(s.strip().split(" ")[-1])
        
        index = len(s)-1
        while index >= 0  and s[index] == " ":
            index -= 1
        temp = index
        while temp >=0 and s[temp] != " ":
            temp -= 1
        return index - temp