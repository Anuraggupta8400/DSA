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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode A= head;
        for(int i=1;i<=(k-1);i++){
            A = A.next;
        }
        //first kth node from begging 

        ListNode temp = A.next;
        ListNode second = head;

        while(temp!=null){
            temp=temp.next;
            second= second.next;
        }

        int tempValue= A.val;
        A.val= second.val;
        second.val=tempValue;

return head;
    }
}