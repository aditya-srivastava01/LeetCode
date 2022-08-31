class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int global = 0;
        int local = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i]-i)>1){
                return false;
            }
        }
        return true;
    }
}