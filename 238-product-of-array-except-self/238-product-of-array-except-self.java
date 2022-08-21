class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int zero = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod *= nums[i];
            }else{
                zero++;
            }
            
        }
        if(zero>1){
            return ans;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i] = prod;
            }
            else{
                if(zero==1){
                    ans[i] = 0;
                }
                else{
                    ans[i] = prod/nums[i];
                }
            }
        }
        return ans;
    }
}