class Solution(object):
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        arr = list(range(1,n+1))
        res = ""
        k -= 1
        while len(arr) != 0:
            temp1 = math.factorial(n-1)
            index1 = k/temp1
            index2 = k%temp1
            #res.append(arr[index1])
            res += str(arr[index1])
            del arr[index1]
            k = index2
            n -= 1
        return res