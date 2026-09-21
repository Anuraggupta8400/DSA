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
    public ListNode middleNode(ListNode head) {
     // i have applied tortoise alogorithm or slow and fast algo
     ListNode turtle =head;
     ListNode rabbit = head;
     //
     while(rabbit != null){
        rabbit = rabbit.next;//1st step
        if(rabbit != null){
            rabbit = rabbit.next;//rabbit takes 2nd step at that position 
            turtle = turtle.next;//turtle takes 1st step at a position 
        }
     }
     return turtle ;// return mid 
    }
}