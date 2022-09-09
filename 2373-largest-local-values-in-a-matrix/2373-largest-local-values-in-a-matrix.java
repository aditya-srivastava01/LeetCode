class Solution {
    int ans[][];
    int[][] grid;
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        this.grid = grid;
        this.ans = new int[n-2][n-2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                solve(i,j);
            }
        }
        return ans;
    }
    public void solve(int i,int j){
        try{
            for(int x = i;x<i+3;x++){
                for(int y = j;y<j+3;y++){
                    ans[i][j] = Math.max(ans[i][j],grid[x][y]);
                }
            }
        }
        catch(Exception e){
            return;
        }
    }
}