class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        solve(n,dp);
        return dp[n];
    }
    public int solve(int n,int[] dp){
        if(n<=1){
            return dp[n] = n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }       
        return dp[n] = solve(n-2,dp)+solve(n-1,dp);
    }
}