/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //using hashset
        HashSet<ListNode>set=new HashSet<>();
        // if(head==null)
        //     return false;
        // if(head.next==head){
        //     return true;//2 nodes cycle
        // }
        // if(head.next==null)
        //     return false;

        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp))
                return true;
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
}