// 

import java.util.Arrays;

class Solution {
    // Memoization table: dp[index][amount]
    private int[][] dp;

    // Recursive function with memoization
    private int solve(int amount, int[] coins, int index) {
        // Base cases
        if (amount == 0) return 1; // Found a valid combination
        if (amount < 0 || index >= coins.length) return 0; // Invalid path

        // If already computed, return stored result
        if (dp[index][amount] != -1) return dp[index][amount];

        // Include current coin
        int include = solve(amount - coins[index], coins, index);

        // Exclude current coin
        int exclude = solve(amount, coins, index + 1);

        // Store and return result
        dp[index][amount] = include + exclude;
        return dp[index][amount];
    }

    public int change(int amount, int[] coins) {
        // Initialize dp array with -1 (uncomputed)
        dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(amount, coins, 0);
    }
}