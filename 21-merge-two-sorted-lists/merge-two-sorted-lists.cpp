/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* dummyNode=new ListNode(-1);
        ListNode* p3=dummyNode;
        
        while(list1!=NULL && list2!=NULL){
            if(list1->val < list2-> val){//add list1 data to p3
                p3->next=list1;
                list1=list1->next;//update list1
                p3=p3->next;//update p3
            }
            else{
                p3->next=list2;
                list2=list2->next;//update list2
                p3=p3->next;
            }
        }
        //1 or more nodes of one list will remain
        while(list1!=NULL){
            p3->next=list1;
            list1=list1->next;
            p3=p3->next;//update p3
        }
        while(list2!=NULL){
            p3->next=list2;
            list2=list2->next;
            p3=p3->next;
        }
        return dummyNode->next;
    }
};