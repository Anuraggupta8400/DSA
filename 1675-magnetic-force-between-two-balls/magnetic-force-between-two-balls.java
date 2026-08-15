class Solution {
    static boolean isvalidans(int position[], int m ,int mindistance    ){
    int ballscount = 1;
    int lastposition = 0;
      for(int i =1 ;i<position.length;i++){
        if(position[i]-position[lastposition] >= mindistance){
            ballscount++;
            lastposition = i;
            if(ballscount == m ){
                return true;
            }
        }

      }
       return false;     
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
         int s =0 ;
         int e = position[n-1]-position[0];
         int ans =-1;
          
          while(s<=e){
            int mid = s+(e-s)/2;
            if(isvalidans(position, m,mid)){
                ans =mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
          }
          return ans;
    }
}