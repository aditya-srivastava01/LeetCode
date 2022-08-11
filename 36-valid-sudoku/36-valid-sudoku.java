class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if (checkCol(board,i)==false || checkRow(board[i])==false){
                return false;
            }
        }
        int[][] range = {{0,2},{3,5},{6,8}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(checkSq(board,range[i][0],range[i][1],j)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkRow(char[] arr){
        int[] nums = new int[128];
        for(int i=0;i<9;i++){
            if(nums[(int)arr[i]]==1){
                return false;
            }else{
                nums[(int)arr[i]] = 1;
            }
            nums[46] = 0;
        }
        return true;
    }
    
    public boolean checkCol(char[][] arr,int n){
        int[] nums = new int[128];
        for(int i=0;i<9;i++){
            if(nums[(int)arr[i][n]]==1){
                return false;
            }else{
                nums[(int)arr[i][n]] = 1;
            }
            nums[46] = 0;
        }
        return true;
    }
    
    public boolean checkSq(char[][] arr,int i,int j,int c){
        int[][] range = {{0,2},{3,5},{6,8}};
        int[] nums = new int[128];
        while(i<=j){
            int x = range[c][0];
            int y = range[c][1];
            while(x<=y){
                if(nums[(int)(arr[i][x])]==1){
                    return false;
                }else{
                    nums[(int)(arr[i][x])] = 1;
                    nums[46] = 0;
                }
                x++;
            }
            
            i++;
        }
        return true;
    }
}