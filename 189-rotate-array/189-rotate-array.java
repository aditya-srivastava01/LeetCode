class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k==0 || k%n==0){
            return ;
        }
        k = k%n;
        int ans[] = new int[n+k];
        for(int i=k;i<k+n;i++){
            ans[i] = nums[i-k];
        }
        for(int i=0;i<k;i++){
            ans[k-i-1] = nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            nums[i] = ans[i];
        }
    }
}