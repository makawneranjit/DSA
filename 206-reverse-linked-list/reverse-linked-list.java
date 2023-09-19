/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //list is empty or contains only one element then return head
        if(head == null || head.next == null)
            return head; 

        ListNode prev = null;
        ListNode next = null; 
        ListNode curr = head;

        while(curr != null) {
            next = curr.next; 
            curr.next = prev; 
            prev = curr;
            curr = next; 
        }
        
        return prev; 
    }
}