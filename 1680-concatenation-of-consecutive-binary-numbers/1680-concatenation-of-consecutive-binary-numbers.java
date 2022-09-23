class Solution {
    public int concatenatedBinary(int n) {
        if(n==1){
            return 1;
        }
        long prev = 1l;
        int mod = 1000_000_007;
        for(int i=2;i<=n;i++){
            prev = ((prev*(int)Math.pow(2,Integer.toBinaryString(i).length()))%mod+(i))%mod;
        }
        int ans = (int)prev;
        return ans;
    }
}