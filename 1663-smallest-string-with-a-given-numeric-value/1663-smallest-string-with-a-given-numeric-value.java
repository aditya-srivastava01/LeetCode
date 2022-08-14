class Solution {
    public String getSmallestString(int n, int k) {
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ans = new char[n];
        int z = k/26;
        
        for(int i=0;i<n;i++){
            if((n-i-1)*26>=k){
                ans[i] = 'a';
                k--;
            }else{
                if(k%26==0){
                    ans[i] = 'z';
                }
                else{
                    ans[i] = alpha[k%26-1];
                }
                k -= k%26;
            }
        }
        return String.valueOf(ans);
    }
}