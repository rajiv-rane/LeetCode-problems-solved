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
    public ListNode sortList(ListNode head) {
        // if(head==null || head.next==null){
        //     return head;
        // }
        ListNode curr=head;
        List<Integer>list=new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        // int[] arr = list.stream().mapToInt(i -> i).toArray();
        Collections.sort(list);
        curr=head;

        for(int i=0;i<list.size();i++){
            curr.val=list.get(i);
            curr=curr.next;
        }
        return head;
    }
}