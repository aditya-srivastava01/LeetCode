class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        int[] abc = new int[26];
        int[] cba = new int[26];
        for(int i=0;i<s.length();i++){
            abc[(int)s.charAt(i)-97]++;
            cba[(int)t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(abc[i]!=cba[i]){
                return false;
            }
        }
        return true;
    }
}