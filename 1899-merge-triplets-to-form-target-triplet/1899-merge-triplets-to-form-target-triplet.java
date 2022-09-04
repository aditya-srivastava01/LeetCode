class Solution {
    public boolean mergeTriplets(int[][] tri, int[] target) {
        int[] ans = {0,0,0};
        int n = tri.length;
        for(int i=0;i<=n/2;i++){
            if(tri[i][0]<=target[0] && tri[i][1]<=target[1] && tri[i][2]<=target[2]){
                ans[0] = Math.max(ans[0],tri[i][0]);
                ans[1] = Math.max(ans[1],tri[i][1]);
                ans[2] = Math.max(ans[2],tri[i][2]);
            }
            if(tri[n-i-1][0]<=target[0] && tri[n-i-1][1]<=target[1] && tri[n-i-1][2]<=target[2]){
                ans[0] = Math.max(ans[0],tri[n-i-1][0]);
                ans[1] = Math.max(ans[1],tri[n-i-1][1]);
                ans[2] = Math.max(ans[2],tri[n-i-1][2]);
            }
            if(ans[0]==target[0] && ans[1]==target[1] && ans[2]==target[2]){
                return true;
            }
        }
        return false;
    }
}