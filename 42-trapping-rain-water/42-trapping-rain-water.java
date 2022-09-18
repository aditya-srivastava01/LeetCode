class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        int left = 0;
        int right = 0;
        while(i<=j){
            if(h[i]>left){
                left = h[i];
            }
            if(h[j]>right){
                right = h[j];
            }
            if(right>left){
                ans += Math.max(0,left-h[i]);
                i++;
            }else{
                ans += Math.max(0,right-h[j]);
                j--;
            }
        }
        return ans;
    }
}