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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry = 0;
    ListNode reshead= new ListNode(-1);
    ListNode restail = reshead;

    while(l1!=null || l2!=null|| carry!=0){
       int sum =0;
         if(l1!=null){
            sum = sum +l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            sum = sum+l2.val;
            l2 = l2.next;
            
        }
        sum = sum+carry;
        int digit = sum%10;
        ListNode newNode = new ListNode(digit);
        restail.next = newNode ;
        restail = newNode;

        carry = sum/10;


    }
    reshead = reshead.next;
    return reshead;  
    }
}