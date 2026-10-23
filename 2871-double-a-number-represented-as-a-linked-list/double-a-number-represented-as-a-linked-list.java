class Solution {
    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode forword = curr.next;
            curr.next = pre;
            pre = curr;
            curr = forword;
        }
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode  rader = new ListNode(-1);
        ListNode curr = rader;

        ListNode temp = head;
        int carry = 0;
        while(temp!= null){
            int value = temp.val;
            int sum = value+value+carry;
            int digit = sum%10;
            //add this list in reder ll
            curr.next = new ListNode(digit);
            curr = curr.next;

            carry = sum/10;
            temp = temp.next;

        }
        if(temp == null && carry !=0){
            curr.next = new ListNode(carry);

        }
        rader = rader.next;
        head = reverse(rader);
        return head;

    }
}