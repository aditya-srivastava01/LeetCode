class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int[] all = new int[mat.length*mat[0].length];
        int k = 0;
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        for(int row[] : mat){
            for(int x : row){
                all[k] = x;
                k++;
            }
        }
        k = 0;
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                ans[i][j] = all[k];
                k++;
            }
        }
        return ans;
    }
}