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
    public ListNode reverseKGroup(ListNode head, int k) {
     //lenght calculate of ll
        int n = 0;
        ListNode temp= head;
        while(temp!=null){
            n++;
            temp= temp.next;
            }

        if(n<k){
            return head;
        }
      ListNode pre = null;
      ListNode curr = head;

//reverse list 
        for(int i=1;i<=k;i++){
            ListNode forword = curr.next;
            curr.next = pre;
            pre = curr ;
            curr = forword ;
        }

        ListNode RecurtionOfHead = reverseKGroup(curr,k);
        head.next= RecurtionOfHead;
        return pre;
    }
}