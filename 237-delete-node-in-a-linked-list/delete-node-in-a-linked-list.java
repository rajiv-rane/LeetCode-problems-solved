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
        // copy value of next node into current node until end
            //that way  NODE value to be removed will not retain its value
            node.val=node.next.val;
            node.next=node.next.next;
       
    }
}