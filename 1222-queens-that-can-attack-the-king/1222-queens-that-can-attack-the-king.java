class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int dig[][] = new int[8][8];
        int x = king[0];
        int y = king[1];
        while(x<8 && y<8){
            dig[x][y]  = 1;
            x++;
            y++;
        }
        x = king[0];
        y = king[1];
        while(x>=0 && y>=0){
            dig[x][y] = 1;
            x--;
            y--;
        }
        x = king[0];
        y = king[1];
        while(x>=0 && y<8){
            dig[x][y] = 1;
            x--;
            y++;
        }
        x = king[0];
        y = king[1];
        while(x<8 && y>=0){
            dig[x][y] = 1;
            x++;
            y--;
        }
        // for(int[] row : dig){
        //     for(int i:row){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        int[][] min = {{100,100},{100,100},{100,100},{100,100},{100,100},{100,100},{100,100},{100,100}};
        for(int[] q: queens){
            List<Integer> list = new ArrayList<>();
            if(q[0]==king[0]){
                if(q[1]>king[1]){
                    min[4] = (solve(min[4],king)>solve(king,q))?q:min[4];
                }if(q[1]<king[1]){
                    min[3] = (solve(min[3],king)>solve(king,q))?q:min[3];
                }
            }
            if(q[1]==king[1]){
                if(q[0]>king[0]){
                    min[1] = (solve(min[1],king)>solve(king,q))?q:min[1];
                }if(q[0]<king[0]){
                    min[6] = (solve(min[6],king)>solve(king,q))?q:min[6];
                }
            }
                if(dig[q[0]][q[1]]==1){
                    if(q[0]<king[0] && q[1]<king[1]){
                        min[0] = (solve(min[0],king)>solve(king,q))?q:min[0];
                    }
                    if(q[0]>king[0] && q[1]>king[1]){
                        min[7] = (solve(min[7],king)>solve(king,q))?q:min[7];
                    }
                    if(q[0]>king[0] && q[1]<king[1]){
                        min[5] = (solve(min[5],king)>solve(king,q))?q:min[5];
                    }
                    if(q[0]<king[0] && q[1]>king[1]){
                       min[2] = (solve(min[2],king)>solve(king,q))?q:min[2];
                    }
                }
        }
        for(int i=0;i<8;i++){
            List<Integer> list = new ArrayList<>();
            if(min[i][0]!=100){
                list.add(min[i][0]);
                list.add(min[i][1]);
                ans.add(list);
            }
        }
        return ans;
    }
    int solve(int[] king, int[] queen){
        int dist = (king[0]-queen[0])*(king[0]-queen[0])+(king[1]-queen[1])*(king[1]-queen[1]);
        return dist;
    }
}