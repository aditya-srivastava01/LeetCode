class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return binarySearch(nums,0,nums.length-1,target);
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