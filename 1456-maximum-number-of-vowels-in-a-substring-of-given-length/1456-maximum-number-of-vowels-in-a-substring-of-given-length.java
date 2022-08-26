class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        int pos = 0;
        boolean[] vow = new boolean[26];
        vow['a'-'a']=true;
        vow['e'-'a']=true;
        vow['i'-'a']=true;
        vow['o'-'a']=true;
        vow['u'-'a']=true;
        for(int i=0;i<k;i++){
            if(vow[arr[i]-'a']){
                ans++;
            }
        }
        char prev = arr[pos];
        int val = ans;
        for(int i=k;i<n;i++){
            prev = arr[i-k];
            if(!vow[prev-'a'] && vow[arr[i]-'a']){
                val++;
            }if(vow[prev-'a'] && !vow[arr[i]-'a']){
                val--;
            }
            ans = Math.max(ans,val);
            if(ans==k){
                return ans;
            }
        }
        return ans;
    }
}