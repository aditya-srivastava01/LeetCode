import java.util.*;
class Solution {
    int ans = Integer.MAX_VALUE;
    Hashtable<Long,Integer> map = new Hashtable<>();
    public int integerReplacement(int n) {
        solve((long)n,0);
        long[] two = {1l,2l, 4l, 8l, 16l, 32l, 64l, 128l, 256l, 512l, 1024l, 2048l, 4096l, 8192l, 16384l, 32768l, 65536l, 131072l, 262144l, 524288l, 1048576l, 2097152l, 4194304l, 8388608l, 16777216l, 33554432l, 67108864l, 134217728l, 268435456l, 536870912l, 1073741824l};
        for(int i=0;i<two.length;i++){
            if(two[i]>n){
                break;
            }
            map.put(two[i],i);
        }
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
        if(map.get(n)!=null){
            ans = Math.min(ans,map.get(n)+sum);
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