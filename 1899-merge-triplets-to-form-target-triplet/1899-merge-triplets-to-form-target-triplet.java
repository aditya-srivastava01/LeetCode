class Solution {
    public boolean mergeTriplets(int[][] tri, int[] target) {
        int[] ans = {0,0,0};
        int n = tri.length;
        for(int i=0;i<=n/2;i++){
            int x = tri[i][0];
            int y = tri[i][1];
            int z = tri[i][2];
            if(x<=target[0] && y<=target[1] && z<=target[2]){
                ans[0] = Math.max(ans[0],x);
                ans[1] = Math.max(ans[1],y);
                ans[2] = Math.max(ans[2],z);
            }
            if(ans[0]==target[0] && ans[1]==target[1] && ans[2]==target[2]){
                return true;
            }
            x = tri[n-i-1][0];
            y = tri[n-i-1][1];
            z = tri[n-i-1][2];
            if(x<=target[0] && y<=target[1] && z<=target[2]){
                ans[0] = Math.max(ans[0],x);
                ans[1] = Math.max(ans[1],y);
                ans[2] = Math.max(ans[2],z);
            }
            if(ans[0]==target[0] && ans[1]==target[1] && ans[2]==target[2]){
                return true;
            }
        }
        return false;
    }
}