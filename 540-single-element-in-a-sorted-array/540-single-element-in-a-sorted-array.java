class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n>=3){
            if(nums[0]!=nums[1]){
                return nums[0];
            }
        }
        for(int i=0;i<n-3;i++){
            if(nums[i]!= nums[i+1] && nums[i+1]!=nums[i+2]){
                return nums[i+1];
            }
        }
        return nums[n-1];
    }
}