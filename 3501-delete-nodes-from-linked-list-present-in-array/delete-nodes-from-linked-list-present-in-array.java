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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            //if current node value is in set
            if(set.contains(curr.val)){
                //if node to be removed is head
                if(prev==null){
                    head=curr.next;// Update the head to the next node
                }
                //if node is in the middle
                else{
                    prev.next=curr.next;
                }
                curr=curr.next;//move to next node
            }
            //if curr node value not in set continue traversing
            else{
                prev=curr;
                curr=curr.next;
            }
        }

        return head;
    }
}