class Solution {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        long ans = Long.MAX_VALUE;
        Arrays.sort(beans);
        if(n==1){
            return 0;
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += beans[i];
        }
        long pre = 0;
        for(int i=0;i<n;i++){
            pre += beans[i];
            ans = Math.min(ans,pre+((sum-pre)-(long)beans[i]*(n-i)));
        }
        return ans;
    }
}