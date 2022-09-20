class Solution {
     char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public String replaceDigits(String str) {
        char[] s = str.toCharArray();
        int n = s.length;
        char[] ans = new char[n];
        int k = 0;
        for(int i=0;i<n-1;i++){
            if('a'<=s[i] && s[i]<='z' && '0'<=s[i+1] && s[i+1]<='9'){
                ans[k] = s[i];
                ans[k+1] = alpha[s[i]-'a'+(s[i+1]-'0')];
                k+=2;
                i++;
                
            }else{
                ans[k] = s[i];
                k++;
            }
        }
        if(!('0'<=s[n-1] && s[n-1]<='9')){
            ans[k] = s[n-1];
            k++;
        }
        return String.valueOf(ans).substring(0,k);
    }
}