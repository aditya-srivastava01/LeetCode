class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int sq = (int)Math.sqrt(area);
        for(int i=sq;i>=1;i--){
            if(area%i==0){
                ans[0] = area/i;
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}