import java.util.*;
class Solution {
    public String customSortString(String o, String str) {
        char[] order = o.toCharArray();
        char[] s = str.toCharArray();
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] cnt = new int[26];
        int n = s.length;
        // char[] ans = new char[n];
        for(int i=0;i<n;i++){
            cnt[s[i]-'a']++;
        }
        String res = "";
        for(int i =0;i<order.length;i++){
            char[] ans = new char[cnt[order[i]-'a']];
            Arrays.fill(ans,order[i]);
            res += String.valueOf(ans);
            cnt[order[i]-'a'] = 0;
        }
        for(int i=0;i<26;i++){
            char[] ans = new char[cnt[i]];
            Arrays.fill(ans,alpha[i]); 
            res += String.valueOf(ans);
        }
        return res;
    }
}