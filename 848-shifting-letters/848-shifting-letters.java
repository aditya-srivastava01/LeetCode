class Solution {
    char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public String shiftingLetters(String str, int[] shifts) {
        char[] s = str.toCharArray();
        int n = shifts.length;
        long sum = 0;
        for(int i=0;i<n;i++){
           sum += shifts[i];
        }
        long[] shift = new long[n];
        long so_far = 0l;
        for(int i=0;i<n;i++){
            long val = shifts[i];
            shift[i] = sum-so_far;
            so_far += val;
            
            long indx = ((s[i]-'a')+shift[i])%26l;
            s[i] = alpha[(int)indx];
        }
        
        return String.valueOf(s);
    }
}