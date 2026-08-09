class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
         int dup=-1 ,  mis=-1;
         for( int index=0 ; index<n;index++ ){
            int value = Math.abs(nums[index]);
            int posofval=value-1;
            //marking this position 
            if(nums[posofval]>0){
                nums[posofval]= -nums[posofval];

            }
            else {
                dup= value;
            }
         }
         //for positive value print the number 
         for(int i= 0; i<n ; i++){
            if(nums[i]>0){

               mis= i+1;
               break;    
            
            }
         }
          return new int[]{dup,mis };
    }
}