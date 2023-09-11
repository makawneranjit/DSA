/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        /*
        Approach:
        1. Swap next node's data to current node. 
        2. break the link there. So that curr.next = next.next; 
        */

        ListNode next = node.next; 
        node.val = next.val; 
        node.next = next.next; 
    }
}