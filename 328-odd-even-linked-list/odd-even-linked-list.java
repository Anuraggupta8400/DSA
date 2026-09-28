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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode oddhead=head;
        ListNode oddtail= head;
        ListNode evenhead= head.next;
        ListNode eventail = head.next;
    
        while(eventail !=null&& eventail.next !=null){
            oddtail.next =eventail.next;
            oddtail= eventail.next;
            eventail.next = oddtail.next;
            eventail = eventail.next;
        }
        oddtail.next =evenhead;
        return oddhead;
    }
}