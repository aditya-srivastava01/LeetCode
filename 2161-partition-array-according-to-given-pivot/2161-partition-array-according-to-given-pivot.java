class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> pvt = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                left.add(nums[i]);
            }if(nums[i]>pivot){
                right.add(nums[i]);
            }if(nums[i]==pivot){
                pvt.add(nums[i]);
            }
        }
        int k = 0;
        for(int i:left){
            nums[k] = i;
            k++;
        }
        for(int i:pvt){
            nums[k] = i;
            k++;
        }
        for(int i:right){
            nums[k] = i;
            k++;
        }
        return nums;
    }
}