class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int extra) {
        int n = rocks.length;
        int[] rem = new int[n];
        for(int i=0;i<n;i++){
            rem[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(rem);
        int ans = 0;
        for(int i=0;i<n;i++){
            if(rem[i]==0){
                ans++;
            }else{
                if(extra>=rem[i]){
                    extra -= rem[i];
                    ans++;
                }
            }
            if(extra==0){
                break;
            }
        }
        return ans;
    }
}