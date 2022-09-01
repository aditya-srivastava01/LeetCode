class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        String ans = "";
        for(int i=n-1;i>=0;i--){
            if(str[i].length()>0){    
                ans += str[i]+" ";
            }    
        }
        return ans.substring(0,ans.length()-1);
    }
}