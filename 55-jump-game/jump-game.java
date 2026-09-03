class Solution {

    static boolean solve(int[] nums, int index, Boolean[] dp) {

        // Base case: last index reached
        if (index == nums.length - 1) {
            return true;
        }

        // Out of bounds
        if (index >= nums.length) {
            return false;
        }

        // Already calculated
        if (dp[index] != null) {
            return dp[index];
        }

        // Cannot jump from here
        if (nums[index] == 0) {
            return dp[index] = false;
        }

        int jumpValue = nums[index];

        for (int jump = 1; jump <= jumpValue; jump++) {

            if (solve(nums, index + jump, dp)) {
                return dp[index] = true;
            }
        }

        return dp[index] = false;
    }

    public boolean canJump(int[] nums) {

        Boolean[] dp = new Boolean[nums.length];

        return solve(nums, 0, dp);
    }
}