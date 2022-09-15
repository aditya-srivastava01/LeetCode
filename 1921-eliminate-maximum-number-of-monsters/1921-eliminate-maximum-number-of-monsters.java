class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];
        for(int i=0;i<n;i++){
            time[i] = dist[i]/(double)speed[i];
        }
        Arrays.sort(time);
        int ans = 0;
        int t = 0;
        for(int i=0;i<n;i++){
            if(t<time[i]){
                ans++;
            }else{
                break;
            }
            t++;
        }
        return ans;
    }
}