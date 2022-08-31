class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int ans[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int r = Math.max(0,i-k);r<=Math.min(i+k,n-1);r++){
                    for(int c = Math.max(0,j-k);c<=Math.min(j+k,m-1);c++){
                        ans[i][j] += mat[r][c];
                    }
                }
            }
        }
        return ans;
    }
}