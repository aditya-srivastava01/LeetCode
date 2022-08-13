class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max>=nums.length-1){
                return true;
            }
            if(nums[i]!=0){
                max = Math.max(nums[i]+i,max);
            }else{
                if(max>=nums.length-1){
                    return true;
                }
                if(max>i){
                    for(int j=i;j<max;j++){
                        // System.out.print(nums[j]+ " ");
                        if(nums[j]!=0){
                            i = j;
                            max = Math.max(nums[i]+i,max);
                            break;
                        }
                    }
                    // System.out.println();
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}