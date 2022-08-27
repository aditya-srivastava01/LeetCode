class Solution {
    public int[] executeInstructions(int n, int[] startPos, String str) {
        char[] s = str.toCharArray();
        int m = s.length;
        int[] ans = new int[m];
        int x_coord = startPos[1];
        int y_coord = startPos[0];
        for(int i=0;i<m;i++){
            int x = x_coord;
            int y = y_coord;
            for(int j=i;j<m;j++){
                if(s[j]=='R'){
                    x++;
                }
                if(s[j]=='L'){
                    x--;
                }
                if(s[j]=='U'){
                    y--;
                }
                if(s[j]=='D'){
                    y++;
                }
                if((x>=0 && x<n) && (y>=0 && y<n)){
                    // System.out.println(x+" "+y);
                    ans[i]++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}