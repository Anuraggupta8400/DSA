/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA==null||headB==null){
        return null;
       }
        ListNode p=headA ;
        ListNode q= headB ;
        
        while(p!=null && q!=null){
            p= p.next;
            q = q.next;
        }

        if(p==null){
            int qExLen=0;
            while(q!=null){
                qExLen++;
                q= q.next;
            }
            while(qExLen-->0){
                headB= headB.next;
            }
        }
        else{
            int pExLen=0;
            while(p!=null){
                pExLen++;
                p= p.next;
            }
            while(pExLen-->0){
                headA= headA.next;

            }
        }
      while(headA!=null &&headB!=null){
        if(headA==headB){
            return headA;
        }
        else{
            headA= headA.next;
            headB = headB.next;
        }
      }
      return null;
    }

}