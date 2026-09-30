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
    public ListNode rotateRight(ListNode head, int k) {
    
       if(head==null || k==0) return head; 
     // length of ll
     int len=1;
    ListNode temp =head;
     while(temp.next!=null){
        len++;
        temp=temp.next;
     }
     // make circular ll
     temp.next =head;
      //intne step pr rotate krni h like 27%3 =3 nodes rotate krni h 
      k = k%len;
     
      temp =head;
// In their node of temp is rotate 
      for(int i=1;i<=len-k-1;i++){
        temp =temp.next;
      }
      // before node line break to assign forword to temp ke next you can return modify head
        ListNode forword = temp.next;
      // line break
      temp.next =null;
      
      return forword; 
    
    
    }



}