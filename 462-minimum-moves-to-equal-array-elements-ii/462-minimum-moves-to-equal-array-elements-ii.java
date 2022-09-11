class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i!=n/2){
                ans += Math.abs(nums[n/2]-nums[i]);
            }
        }   
        return ans;
    }
}