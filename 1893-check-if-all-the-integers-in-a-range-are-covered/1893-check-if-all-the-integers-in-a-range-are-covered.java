class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] nums = new int[right];
        for(int[] range:ranges){
            for(int i=range[0];i<=Math.min(right,range[1]);i++){
                nums[i-1] = 1;
            }
        }
        for(int i=left;i<=right;i++){
            if(nums[i-1]==0){
                return false;
            }
        }
        return true;
    }
}