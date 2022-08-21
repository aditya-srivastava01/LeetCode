class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int c = 0;
        for(int i=0;i<n;i++){
            if(Rsearch(matrix,0,m-1,target,i) || (c<m && Csearch(matrix,0,n-1,target,c))){
                return true;
            }
            c++;
        }
        return false;
    }
    public boolean Rsearch(int arr[][], int l, int r, int x,int row){
        if (r >= l) {
            int mid = l+(r-l)/2;
            if (arr[row][mid] == x)
                return true;
            if (arr[row][mid] > x)
                return Rsearch(arr, l, mid - 1, x,row);
            return Rsearch(arr, mid + 1, r, x,row);
        }
        return false;
    }
    public boolean Csearch(int arr[][], int l, int r, int x,int col){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid][col] == x)
                return true;
            if (arr[mid][col] > x)
                return Csearch(arr, l, mid - 1, x,col);
            return Csearch(arr, mid + 1, r, x,col);
        }
        return false;
    }
}