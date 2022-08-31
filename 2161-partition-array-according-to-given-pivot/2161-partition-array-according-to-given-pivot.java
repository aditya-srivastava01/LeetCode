class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int k = 0;
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> right = new ArrayList<>();
        List<Integer> pvt = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[k] = nums[i];
                k++;
            }if(nums[i]>pivot){
                right.add(nums[i]);
            }if(nums[i]==pivot){
                pvt.add(nums[i]);
            }
        }
        for(int i:pvt){
            ans[k] = i;
            k++;
        }
        for(int i:right){
            ans[k] = i;
            k++;
        }
        return ans;
    }
}