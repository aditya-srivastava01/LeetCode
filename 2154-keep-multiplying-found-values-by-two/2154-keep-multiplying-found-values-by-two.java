class Solution {
    public int findFinalValue(int[] nums, int original) {
        int[] arr = new int[10001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<1000;i++){
            if(arr[original]>=1){
                original *= 2;
            }else{
                break;
            }
        }
        return original;
        
    }
}