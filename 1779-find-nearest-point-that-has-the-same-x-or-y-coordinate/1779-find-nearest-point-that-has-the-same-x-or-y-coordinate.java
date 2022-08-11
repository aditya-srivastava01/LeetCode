class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int[] dist = new int[10001];
        int[] point = {x,y};
        int min_dist = 200000;
        int min = 1000000;
        for(int i = 0;i<points.length;i++){
            if(points[i][0]==point[0] || points[i][1]==point[1]){
                int val = solve(point,points[i]);    
                if(val<min_dist){
                    min_dist = val;
                    min = i;
                    // System.out.println(min_dist+" "+min+"  Min");
                }if(val==min_dist){
                    min = Math.min(min,i);
                }
            }
        }
        return (min==1000000)?-1:min;
    }
    public int solve(int[] king, int[] queen){
        int dist = Math.abs(king[0]-queen[0])+Math.abs(king[1]-queen[1]);
        return dist;
    }
}