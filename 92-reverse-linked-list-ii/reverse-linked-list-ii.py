# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy=ListNode(0,head) #it's pointing to the head node

        left_prev,curr=dummy,head
        # 1) reach the node at position 'left'
        for i in range(left-1):
            left_prev,curr=curr,curr.next

        # Now curr=left and the leftPrev="Node before left"
        # 2) reverse from left to right
        prev=None
        for i in range(right-left+1):
            tempNext=curr.next
            curr.next=prev
            prev,curr=curr,tempNext

            # leftPrev.next is pointing to left position node
        # 3) updating the pointers
        left_prev.next.next=curr #curr is node after "right"
        left_prev.next=prev #prev is "right"
        return dummy.next
