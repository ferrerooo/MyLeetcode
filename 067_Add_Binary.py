class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        p1 = len(a)-1
        p2 = len(b)-1
        result = []
        carry = 0
        
        while p1 >=0 and p2 >= 0:
            temp = int(a[p1]) + int(b[p2]) + carry
            result.append(str(temp%2))
            carry = temp/2
            p1 -=1
            p2 -=1
        
        if p1 <0 and p2 < 0: 
            if carry == 1:
                result.append("1")
            return "".join(result[::-1])
        
        c = a[:p1+1] if p1>=0 else b[:p2+1]
        
        p3 = len(c)-1
        
        while p3 >=0:
            temp = int(c[p3])+carry
            result.append(str(temp%2))
            carry = temp/2
            p3 -=1
        if carry == 1:
            result.append("1")
        return "".join(result[::-1])
        