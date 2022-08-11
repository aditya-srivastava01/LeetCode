class Solution {
    public int minSteps(String s, String t) {
        int[] one = new int[26];
        int[] two = new int[26];
        for(int i=0;i<s.length();i++){
            one[s.charAt(i)-'a']++;
        }for(int i=0;i<t.length();i++){
            two[t.charAt(i)-'a']++;
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            ans += Math.abs(one[i]-two[i]);
        }
        return ans;
    }
}