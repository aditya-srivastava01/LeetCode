class Solution {
    int[][] mat;
    int n;
    int m;
    public int countSquares(int[][] mat) {
        this.mat = mat;
        this.n= mat.length;
        this.m = mat[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    ans += give(i,j);
                }
            }
        }
        return ans;
    }
    public int give(int i,int j){
        int ans = 0;
        int size = 1;
        try{
            while(true){
                boolean one = true;
                for(int x = i;x<i+size;x++){
                    for(int y = j;y<j+size;y++){
                        if(mat[x][y]==0){
                            one = false;
                            break;
                        }    
                    }
                    if(!one){
                        break;
                    }
                } 
                if(one){
                    ans++;
                }
                if(size>n || size>m){
                    return ans;
                }
                size++;
            }
        }catch(Exception e){
            return ans;
        }
        // return ans;
    }
}