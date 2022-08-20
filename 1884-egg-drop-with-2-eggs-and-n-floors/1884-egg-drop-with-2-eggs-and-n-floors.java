class Solution {
    public int twoEggDrop(int n) {
        if(n==1){
            return 1;
        }
        int ans = 0;
        int start = 0;
        while(n>1){
            n -= start;
            if(n<=0){
                break;
            }
            start++;
            ans++;
            // System.out.println(n);
        }
        return ans;
    }
}