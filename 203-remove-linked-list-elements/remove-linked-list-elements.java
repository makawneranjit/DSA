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
    public ListNode removeElements(ListNode head, int val) {
        /*
        Approach:
        1. Check & move head node if head node contains the value to be deleted
        2. take head in temp node and check for each next node of temp if it contains the value to be deleted
        3. return head; 

        */

        //Check & move head node if head node contains the value to be deleted
        while(head!= null && head.val == val)
            head = head.next; 

        //take head in temp node and check for each temmp node's next' if it contains the value to be deleted
        ListNode temp = head; 
        while(temp != null && temp.next != null) {
            if(temp.next != null && temp.next.val == val)
                temp.next = temp.next.next; 
            else
                temp = temp.next; 
        }

        return head; 
    }
}