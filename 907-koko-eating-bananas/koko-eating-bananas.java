// class Solution {
//     static boolean isvalidans(int piles[], int h,int max){
//    long total = 0;
//    for(int i = 0; i<piles.length;i++){
//     if(piles[i]>max){
//     long curr = piles[i]-max;
//     total += curr;
//     }
//    }
//    if(total>=h){
//     return true;
//    }
//    else{
//     return false;
//    }
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int n = piles.length;
//         int s = 0;
//          int maxi = -1;
//          for(int i = 0;i<n;i++){
//             if(piles[i]> maxi){
//                 maxi = piles[i];
//             }
//          }
//          int ans =-1;

//          int e = maxi;
//          while(s<=e){
//             int mid = s+(e-s)/2;
//             if(isvalidans(piles, h,mid)){
//                 ans = mid;
//                 s = mid+1;
//             }
//             else{
//                 e = mid-1;
//             }
//          } return ans;
//     }
// }
class Solution {

    // Check if Koko can eat all bananas at speed 'speed' within 'h' hours
    static boolean canEatAll(int[] piles, int h, int speed) {
        long hours = 0;
        for (int pile : piles) {
            // Use ceiling division without floating point
            hours += (pile + speed - 1) / speed;
            if (hours > h) return false; // Early exit if already exceeding h
        }
        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = 0;

        // Find the largest pile
        for (int pile : piles) {
            if (pile > maxPile) maxPile = pile;
        }

        int s = 1; // Minimum speed
        int e = maxPile; // Maximum speed
        int ans = maxPile;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (canEatAll(piles, h, mid)) {
                ans = mid; // Possible answer, try smaller speed
                e = mid - 1;
            } else {
                s = mid + 1; // Need more speed
            }
        }
        return ans;
    }
}
