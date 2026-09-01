// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> outer = new ArrayList<>();
//         outer.add(new ArrayList<>());

//         for(int num : nums){
//             int n = outer.size();
//             for(int i = 0; i < n; i++){
//                 // Create a new subset from existing one
//                 List<Integer> internal = new ArrayList<>(outer.get(i));
//                 internal.add(num);
//                 outer.add(internal); // Add it to the list
//             }
//         }
//         return outer;
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        helper(nums, 0, current, ans);

        return ans;
    }

    private void helper(int[] nums, int index,
                         List<Integer> current,
                         List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // 1. Don't take nums[index]
        helper(nums, index + 1, current, ans);

        // 2. Take nums[index]
        current.add(nums[index]);

        helper(nums, index + 1, current, ans);

        // Backtrack
        current.remove(current.size() - 1);
    }
}