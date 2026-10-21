// count length of LL of n 
// base of linked list by n/k example node 10 divide by 4,3,3
// extranodes in ll by n%k
// width = base + extranodes
// seperate list in part 
//return ans
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        ListNode temp = head ;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int baseSize = (n/k);
        int extranodes = (n%k);


        ListNode pre = null;
        ListNode curr = head;

        for(int part =0;part<k;part++){
            if(curr == null){
                res[part]=curr;
                continue;
            }

            res[part]=curr;

            int width= baseSize +(extranodes>0?1:0);
            extranodes--;
            for(int i =1;i<=width;i++){
                pre = curr;
                curr =curr.next;
            }
            pre.next = null;
            pre = null;

        }
        return res;
    }
}