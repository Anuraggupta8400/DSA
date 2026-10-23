class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
            return new int[]{-1,-1};
        }
        ListNode pre= head;
        ListNode curr = head.next;
        int i =1;
        List<Integer> criticalpoints = new ArrayList<>();
        while(curr!=null&curr.next!=null){
            // comparing for local maxima 
            if(curr.val>pre.val && curr.val>curr.next.val){
                criticalpoints.add(i);
            }
            //comparing for local minima 
            if(curr.val<pre.val && curr.val<curr.next.val){
                criticalpoints.add(i);
            }
             curr = curr.next;
             pre = pre.next;
             i = i+1;
        }
            if(criticalpoints.size()<2){
                return new int[]{-1,-1};
            }

            int minDs=Integer.MAX_VALUE;

            for(int j=1; j<criticalpoints.size();j++){
                minDs = Math.min(minDs,criticalpoints.get(j)-criticalpoints.get(j-1));
            } 
            int maxDs = criticalpoints.get(criticalpoints.size()-1)-criticalpoints.get(0);
    return new int[]{minDs,maxDs};
    }
}