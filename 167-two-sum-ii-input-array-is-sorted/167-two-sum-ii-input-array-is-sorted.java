class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        for(int i=0;i<n;i++){
            int req = target-numbers[i];
                int res = search(numbers,0,n-1,req,i);
                if(res>=0){
                    ans[0] = Math.min(i+1,res+1);
                    ans[1] = Math.max(i+1,res+1);
                    return ans;
                }
        }
        return ans;
    }
    public int search(int[] arr,int l,int r,int target,int indx){
        if(r>=l){
           int mid = l+(r-l)/2;
            if(arr[mid]==target && mid!=indx){
                return mid;
            }
            if(arr[mid]>target){
                return search(arr,l,mid-1,target,indx);
            }
            return search(arr,mid+1,r,target,indx);
        }
        return -1;
    }
}
    // public boolean binarySearch(int arr[], int l, int r, int x){
    //     if (r >= l) {
    //         int mid = l + (r - l) / 2;
    //         if (arr[mid] == x)
    //             return true;
    //         if (arr[mid] > x)
    //             return binarySearch(arr, l, mid - 1, x);
    //         return binarySearch(arr, mid + 1, r, x);
    //     }
    //     return false;
    // }