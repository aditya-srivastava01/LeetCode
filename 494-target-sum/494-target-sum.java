public class Solution {
    int ans = 0;
    
    public int findTargetSumWays(int[] nums, int S) {
        gibe(nums, 0, 0, S);
        return ans;
    }
    
    public void gibe(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S) {
                ans++;
            }
        } else {
            gibe(nums, i + 1, sum + nums[i], S);
            gibe(nums, i + 1, sum - nums[i], S);
        }
    }
}