class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int n = arr.length;
      int s= 0;
      int e= arr.length-1;
      int ans = -1;
      while(s<=e){
        int mid = s+(e-s)/2;
        if(arr[mid] < arr[mid+1]){
            //array is accendig order thats what index will be in right part 
               s = mid+1; 
     
             }
             else{
                //arr[mid]>= arr[mid+1]; 
                //that s mean index may be on mid or mid -1 
                ans = mid;
                e = mid-1;

             }
       }   
         return ans;}

}