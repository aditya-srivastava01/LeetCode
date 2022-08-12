class Solution {
    public int maxIceCream(int[] nums, int coins) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=coins){
                ans++;
                coins -= nums[i];
            }else{
                return ans;
            }
        }
        return ans;
    }
}