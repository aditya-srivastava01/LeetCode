class Solution {
    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = gcd(ans,nums[i]);
            if(ans==1){
                return true;
            }
        }
        return ans==1;
    }
    public int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}