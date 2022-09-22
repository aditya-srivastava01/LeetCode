class Solution {
    public String reverseWords(String s) {
        String ans[] = s.split(" ");
        int n = ans.length;
        for(int i=0;i<n;i++){
            char[] arr = ans[i].toCharArray();
            int len = arr.length;
            for(int j=0;j<len/2;j++){
                char c = arr[j];
                arr[j] = arr[len-j-1];
                arr[len-j-1] = c;
            }
            ans[i] = String.valueOf(arr);
        }
        return String.join(" ",ans);
    }
}