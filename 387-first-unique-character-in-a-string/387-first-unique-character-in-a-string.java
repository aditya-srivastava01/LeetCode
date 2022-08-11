class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int[] indx = new int[26];
        Arrays.fill(indx,100001);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            indx[s.charAt(i)-'a'] = Math.min(i,indx[s.charAt(i)-'a']);
        }
        int ans = 100001;
        for(int i=0;i<26;i++){
            if(arr[i]==1){
                ans = Math.min(ans,indx[i]);
            }
        }
        if(ans==100001){
            ans =-1;
        }
        return ans;
    }
}