class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int ans = 0;
        for(String word : words){
            int len = word.length();
            boolean pre = true;
            if(len>=n){
                for(int i=0;i<n;i++){
                    if(pref.charAt(i)!=word.charAt(i)){
                        pre = false;
                        break;
                    }
                }
            }else{
                pre = false;
            }
            if(pre){
                ans++;
            }
        }
        return ans;
    }
}