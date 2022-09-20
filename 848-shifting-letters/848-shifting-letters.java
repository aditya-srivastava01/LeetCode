class Solution {
    public String shiftingLetters(String str, int[] shifts) {
        char[] s = str.toCharArray();
        int n = shifts.length;
        long sum = 0;
        for(int i=0;i<n;i++){
           sum += shifts[i];
        }
        // System.out.println(sum>Integer.MAX_VALUE);
        long[] shift = new long[n];
        long so_far = 0l;
        for(int i=0;i<n;i++){
            long val = shifts[i];
            shift[i] = sum-so_far;
            so_far += val;
        }
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // for(long i : shift){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        for(int i=0;i<n;i++){
            long indx = ((s[i]-'a')+shift[i])%26l;
            int index = (int)indx;
            // System.out.println(index);
            s[i] = alpha[index];
        }
        return String.valueOf(s);
    }
}