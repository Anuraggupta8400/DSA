
class Solution {

    static boolean isvalidans(int nums[], int k, int maxsum) {
        int studentcount = 1;
        int pages = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pages + nums[i] <= maxsum) {
                pages += nums[i];
            } else {
                studentcount++;
                if (studentcount > k || nums[i] > maxsum) {
                    return false;
                } else {
                    pages = nums[i];
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }

        int n = nums.length;
        int sum = 0;
        int maxElement = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxElement = Math.max(maxElement, nums[i]);
        }

        int s = maxElement; //  start from max element
        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isvalidans(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
