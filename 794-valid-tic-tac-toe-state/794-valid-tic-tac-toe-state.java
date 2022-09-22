class Solution {
    public boolean validTicTacToe(String[] board) {
        int o = 0;
        int x = 0;
        int xwins = 0;
        int owins = 0;
        int k = 0;
        for(String row : board){
            for(char c : row.toCharArray()){
                if(c=='O'){
                    o++;
                }if(c=='X'){
                    x++;
                }
            }
            if(row.equals("XXX")){
                board[k] = "123";
                xwins++;
            }if(row.equals("OOO")){
                board[k] = "123";
                owins++;
            }
            k++;
        }
        // for(String row : board){
        //     System.out.println(row);
        // }
        if(xwins+owins>1){
            return false;
        }
        for(int i=0;i<3;i++){
            String col = "";
            for(int j=0;j<3;j++){
                col += board[j].charAt(i);
            }
            if(col.equals("XXX")){
                xwins++;
            }if(col.equals("OOO")){
                owins++;
            }
            // System.out.println(col);
        }
        if(xwins+owins>1){
            return false;
        }
        String dig1 = ""+board[0].charAt(0)+ board[1].charAt(1)+ board[2].charAt(2);
        String dig2 = ""+board[0].charAt(2)+ board[1].charAt(1)+ board[2].charAt(0);
        // System.out.println(dig1+"\n"+dig2);
        if(dig1.equals("OOO")){
            
            owins++;
        }
        if(dig1.equals("XXX")){
            xwins++;
        }
        if(dig2.equals("OOO")){
            owins++;
        }
        if(dig2.equals("XXX")){
            xwins++;
        }

        if(xwins+owins>1 && !dig1.equals(dig2)){
            return false;
        }
        if(x==0 && o>0){
            return false;
        }
        if(o>x){
            return false;
        }
        if(x>o+1){
            return false;
        }
        if(xwins==1 && o==x){
            return false;
        }
        if(owins==1 && o+x==9){
            return false;
        }
        return true;
    }
}