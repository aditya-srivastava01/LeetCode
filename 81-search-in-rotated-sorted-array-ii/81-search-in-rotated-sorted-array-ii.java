class Solution {
    public boolean search(int[] nums, int target) {
        // Arrays.sort(nums);
        int n = nums.length;
        int pos = n-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==target || nums[i+1]==target){
                return true;
            }
            if(nums[i+1]<nums[i]){
                pos = i;
                break;
            }
        }
        return binarySearch(nums,pos,n-1,target);
    }
    public boolean binarySearch(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return true;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return false;
    }
}