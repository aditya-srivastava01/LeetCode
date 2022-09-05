class Solution {
    int num = 1;
    List<Integer> ans = new ArrayList<>();
    int left = 0;
    int right = 0;
    int up = 0;
    int down = 0;
    public int[][] generateMatrix(int n) {
        int m = n;
        left = 0;
        right = m-1;
        up = 0;
        down = n-1;
        int[][] mat = new int[n][n];
        add(mat); 
        return mat;
    }
    public void add(int[][] mat){
        if(left>right || up>down){
            return;
        }
        int i = up;
        int j = left;
        while(j<=right){
            mat[i][j] = num;
            num++;
            j++;
        }
        up++;
        j = right;
        i = up;
        if(left>right || up>down){
            return;
        }
        
        while(i<=down){
            mat[i][j] = num;
            num++;
            i++;
        }
        right--;
        i = down;
        j = right;
        if(left>right || up>down){
            return;
        }         
        while(j>=left){
            mat[i][j] = num;
            num++;
            j--;
        }
        down--;
        i = down ;
        j = left;
        if(left>right || up>down){
            return;
        }
        while(i>=up){
            mat[i][j] = num;
            num++;
            i--;
        }
        left++;
        add(mat);
        
    }
}