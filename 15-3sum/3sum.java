// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> ans= new HashSet<>();
//         int n = nums.length;
//         for(int i= 0;i<n-2;i++){
//             for(int j = i+1;j<n-1;j++){
//                 for(int k= j+1;k<n;k++){
//                  if(nums[i]+nums[j]+nums[k]==0){
//                     List<Integer> temp= new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     temp.add(nums[k]);
//                     Collections.sort(temp);
//                               ans.add(temp); }
                               
//                  }
//             }
        
//         }    return new  ArrayList(ans); 
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }
}