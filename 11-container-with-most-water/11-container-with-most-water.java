class Solution {
    public int maxArea(int[] h) {
        int ans = 0;
        int n = h.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            ans = Math.max(Math.min(h[i],h[j])*(j-i) ,ans );
            if(h[i]<h[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}