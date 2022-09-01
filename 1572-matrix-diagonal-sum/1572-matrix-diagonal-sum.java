class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            ans += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        m--;
        while(i>=0 && m>=0){
            ans += mat[i][m];
            i++;
            m--;
        }
        if(mat.length%2==0){
            return ans;
        }
        return ans-mat[mat.length/2][mat.length/2];
    }
}