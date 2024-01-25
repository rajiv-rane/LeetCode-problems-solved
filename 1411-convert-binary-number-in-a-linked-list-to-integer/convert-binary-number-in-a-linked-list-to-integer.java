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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        while(head!=null){
            sum=sum*2;
            sum=sum+head.val;
            head=head.next;
        }
        return sum;
        // int bin=0;
        // ListNode temp=head;
        // int node=0;
        // int ans=0;
        // int p=1;
        // //traverse the LL
        // while(temp!=null){
        //     node=10*node+temp.val;
        //     // p=p*10;
        //     temp=temp.next;
        // }
        // while(node>0){
        //     int l=node%10;
        //     ans=ans*2+l;
        //     // p=p*10;
        //     node=node/10;
        // }
        // return ans;
    }
}