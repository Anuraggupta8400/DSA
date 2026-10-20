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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while (fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow= slow.next;
            }
        
        if(fast == slow){
            hasCycle = true;
            break;
        }
        }
       if(hasCycle ==false ){
        return null;
       }
       slow= head;
       while(fast!=slow){
        slow =slow.next;
        fast = fast.next;
       }
     //  ListNode startingNode = slow;
       return slow;





    }
}