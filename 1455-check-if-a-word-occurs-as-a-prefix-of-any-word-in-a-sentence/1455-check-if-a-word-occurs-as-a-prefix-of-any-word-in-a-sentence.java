class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        return prefixCount(words,searchWord);
    }
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int ans = -1;
        int k = 0;
        for(k=0;k<words.length;k++){
            int len = words[k].length();
            boolean pre = true;
            if(len>=n){
                for(int i=0;i<n;i++){
                    if(pref.charAt(i)!=words[k].charAt(i)){
                        pre = false;
                        break;
                    }
                }
            }else{
                pre = false;
            }
            if(pre){
                ans=k;
                return ans+1;
            }
        }
        return ans;
    }
}