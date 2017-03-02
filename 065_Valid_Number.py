class Solution(object):
    def isNumber(self, sin):
        """
        :type s: str
        :rtype: bool
        """
        if sin == None : return false
        sin = sin.strip()
        tokens = sin.split("e")
        
        if len(tokens) >2:
            return False
        
        part1 = True
        hasDot = False
        
        for s in tokens:
            if s is None or s.strip() == "" : return False
                
            if not part1: hasDot = True
            
            if s[0].isdigit() is False and s[0]!='+' and s[0]!='-' and s[0]!='.' : return False
            
            if s[0] == '+' or s[0] == '-' : s = s[1:]
            
            count = 0
            for i in range(len(s)) :
                if s[i].isdigit() is not True:
                    if s[i] != '.': return False
                    if hasDot : return False
                    hasDot = True
                else: count += 1
            
            if count == 0 : return False
            part1 = False
        
        return True
            
                