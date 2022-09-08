class Solution {
    char[][] board;
    int n = 0;
    int m = 0;
    public int countBattleships(char[][] board) {
        this.board = board;
        this.n = board.length;
        this.m = board[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X'){
                    ans++;
                    clear(i,j);
                }
            }
        }
        return ans;
    }
    public void clear(int i,int j){
        if(i+1<n && board[i+1][j]=='X'){
            i++;
            while(i<n){
                if(board[i][j]=='X'){
                    board[i][j] = '0';
                }else{
                    break;
                }
                i++;
            }
        }else if(j+1<m && board[i][j+1]=='X'){
            j++;
            while(j<m){
                if(board[i][j]=='X'){
                    board[i][j] = '0';
                }else{
                    break;
                }
                j++;
            }
        }
    }
}