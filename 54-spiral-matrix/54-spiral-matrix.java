class Solution {
    List<Integer> ans = new ArrayList<>();
    int left = 0;
    int right = 0;
    int up = 0;
    int down = 0;
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        left = 0;
        right = m-1;
        up = 0;
        down = n-1;
        add(mat);
        return ans;
    }
    public void add(int[][] mat){
        if(left>right || up>down){
            return;
        }
        int i = up;
        int j = left;
        while(j<=right){
            ans.add(mat[i][j]);;
            j++;
        }
        up++;
        j = right;
        i = up;
        if(left>right || up>down){
            return;
        }
        
        while(i<=down){
            ans.add(mat[i][j]);
            i++;
        }
        right--;
        i = down;
        j = right;
        if(left>right || up>down){
            return;
        }         
        while(j>=left){
            ans.add(mat[i][j]);
            j--;
        }
        down--;
        i = down ;
        j = left;
        if(left>right || up>down){
            return;
        }
        while(i>=up){
            ans.add(mat[i][j]);
            i--;
        }
        left++;
        add(mat);
        
    }
}