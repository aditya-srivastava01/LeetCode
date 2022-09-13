class Solution {
    int ans = Integer.MAX_VALUE;
    public int integerReplacement(int n) {
        solve((long)n,0);
        return ans;
    }
    public void solve(long n,int sum){
        if(n==1l){
            ans = Math.min(ans,sum);
            return ;
        }
        if(sum>ans){
            return;
        }
        if(n%2==1l){
            solve(n+1l,sum+1);
            solve(n-1l,sum+1);
        }else{
            solve(n/2l,sum+1);
        }
    }
}