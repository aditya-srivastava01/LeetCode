class Solution {
    public int numberOfBeams(String[] bank) {
        int ans  = 0;
        int n = bank.length;
        int m = bank[0].length();
        int crr = 0;
        for(int i=0;i<bank.length;i++){
            int one = 0;
            for(int j=0;j<m;j++){
                if(bank[i].charAt(j)=='1'){
                    one++;
                }
            }
            ans += one*crr;
            if(one!=0){
                crr = one;
            }
        }
        return ans;
    }
}