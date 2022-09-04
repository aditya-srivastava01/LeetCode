class Solution {
    public boolean mergeTriplets(int[][] trip, int[] target) {
        int[] ans = {0,0,0};
        for(int[] tri:trip){
            if(tri[0]<=target[0] && tri[1]<=target[1] && tri[2]<=target[2]){
                ans[0] = Math.max(ans[0],tri[0]);
                ans[1] = Math.max(ans[1],tri[1]);
                ans[2] = Math.max(ans[2],tri[2]);
            }
            if(ans[0]==target[0] && ans[1]==target[1] && ans[2]==target[2]){
                return true;
            }
        }
        return false;
    }
}