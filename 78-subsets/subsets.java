

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