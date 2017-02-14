# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if head == None : return head
        
        len = 1;
        tail = head;
        while tail.next != None:
            len += 1
            tail = tail.next
            
        if k%len == 0 : return head

        k1 = len - (k%len)
        
        for i in range(0,k1):
            temp = head.next
            head.next = None
            tail.next = head
            tail = tail.next
            head = temp
        
        return head
            