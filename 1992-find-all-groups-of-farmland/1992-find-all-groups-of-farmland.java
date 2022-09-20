class Solution {
    int[][] land;
    int n = 0;
    int m = 0;
    public int[][] findFarmland(int[][] land) {
        this.land = land;
        this.n = land.length;
        this.m = land[0].length;
        List<int[]> list = new ArrayList<>();
        // print();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j]==1){
                    int[] arr = solve(i,j);
                    int[] coord = {i,j,arr[0],arr[1]};
                    list.add(coord);
                    // print();
                }
            }
        }
        int[][] ans = new int[list.size()][4];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public int[] solve(int i,int j){
        int r = i;
        int c = j;
        for(i=i;i<n;i++){
            if(land[i][j]==0){
                break;
            }else{
                land[i][j] = 0;
            }
        }
        i--;
        for(j=j+1;j<m;j++){
            if(land[i][j]==0){
                break;
            }else{
                land[i][j] = 0;
            }
        }
        j--;
        // System.out.println(i+" "+j);
        for(r=r;r<=i;r++){
            Arrays.fill(land[r],c,j+1,0);
        }
        return new int[] {i,j};
    }
    void print(){
        for(int[] row : land){
            for(int c : row){
                System.out.print(c+" ");
            }System.out.println();
        }
        System.out.println("----------------------------------------");
    }
}