class Solution {
    public char findTheDifference(String s, String t) {
        int[] one = new int[26];
        char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i=0;i<s.length();i++){
            one[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            one[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++){
            if(one[i]==-1){
                return arr[i];
            }
        }
        return 'a';
    }
}