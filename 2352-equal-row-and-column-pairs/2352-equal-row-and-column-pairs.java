import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Hashtable<String,Integer> row = new Hashtable<>();
        for(int[] r:grid){
            String[] num = new String[n];
            for(int i=0;i<n;i++){
                num[i] = "."+String.valueOf(r[i]);
            }
            String number = String.join("",num);
            row.put(number,row.getOrDefault(number,0)+1);
        }
        int ans = 0;
        for(int j=0;j<n;j++){
            String num = "";
            for(int i=0;i<n;i++){
                num += "."+String.valueOf(grid[i][j]);
            }
            if(row.get(num)!=null){
                ans += row.get(num);
            }
        }
        return ans;
    }
}