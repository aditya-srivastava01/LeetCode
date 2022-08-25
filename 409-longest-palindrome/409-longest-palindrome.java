class Solution {
    public int longestPalindrome(String str) {
        int ans = 0;
        char[] s = str.toCharArray();
        int[] up = new int[26];
        int[] low = new int[26];
        for(int i=0;i<s.length;i++){
            if('a'<=s[i] && s[i]<='z'){
                low[s[i]-'a']++;
            }else{
                up[s[i]-'A']++;
            }
        }
        boolean mid = false;
        for(int i=0;i<26;i++){
            if(up[i]>1){
                ans += up[i]/2*2;
            }if(low[i]>1){
                ans += low[i]/2*2;
            }
            if(up[i]%2==1 || low[i]%2==1){
                mid = true;
            }
        }
        if(mid){
            ans++;
        }
        return ans;
    }
}