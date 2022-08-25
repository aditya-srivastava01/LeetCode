class Solution {
    int[] ans;
    int row = 0;
    int col = 0;
    int k = 0;
    int type = 0;
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ans = new int[n*m];
        for(int i=0;i<n;i++){
            if(type==0){
                type = 1;
            }else{
                type = 0;
            }
            up(i,0,n,m,mat,type);
        }
        for(int i=1;i<m;i++){
            if(type==1){
                type = 0;
            }else{
                type = 1;
            }
            up(n-1,i,n,m,mat,type);
        }
        return ans;
    }
    public void up(int i,int j,int n,int m,int[][] mat,int type){
        List<Integer> temp = new ArrayList<>();
        while(i>=0 && j<m){
            if(type==1){
                ans[k] = mat[i][j];
                k++;
            }else{
                temp.add(mat[i][j]);
            }
            i--;
            j++;
        }
        if(temp.size()!=0){
            for(int x=temp.size()-1;x>=0;x--){
                ans[k] = temp.get(x);
                k++;
            }
        }
    }
}