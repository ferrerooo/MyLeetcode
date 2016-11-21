/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1 == null || l2 == null)
            return l1==null? l2:l1;
        
        int carryOver = 0;
        ListNode dummy = new ListNode(0);
        ListNode cursor = dummy;
        while (l1!=null && l2!=null) {
            cursor.next = new ListNode((l1.val+l2.val+carryOver)%10);
            carryOver = (l1.val+l2.val+carryOver)/10;
            cursor = cursor.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        ListNode l = l1==null?l2:l1;
        while (l!=null && carryOver != 0) {
            cursor.next = new ListNode((l.val + carryOver)%10);
            carryOver = (l.val + carryOver)/10;
            cursor = cursor.next;
            l = l.next;
        }
        
        if (carryOver == 0) 
            cursor.next = l;
        else {
            cursor.next = new ListNode(1);
        }
        return dummy.next;
    }
}