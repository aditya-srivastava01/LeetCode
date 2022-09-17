class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int[] cnt1 = new int[10];
        int[] cnt2 = new int[10];
        int n = s.length;
        for(int i=0;i<n;i++){
            if(s[i]==g[i]){
                a++;
            }else{
                cnt1[s[i]-'0']++;
                cnt2[g[i]-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            b += Math.min(cnt1[i],cnt2[i]);
        }
        String ans = ""+a+"A"+b+"B";
        return ans;
    }
}