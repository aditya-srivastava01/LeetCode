import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Hashtable<String,Integer> row = new Hashtable<>();
        Hashtable<String,Integer> col = new Hashtable<>();
        Set<String> set = new HashSet<>();
        for(int[] r:grid){
            String[] num = new String[n];
            for(int i=0;i<n;i++){
                num[i] = "."+String.valueOf(r[i]);
            }
            String number = String.join("",num);
            row.put(number,row.getOrDefault(number,0)+1);
            set.add(number);
        }
        for(int j=0;j<n;j++){
            String[] num = new String[n];
            for(int i=0;i<n;i++){
                num[i] = "."+String.valueOf(grid[i][j]);
            }
            String number = String.join("",num);
            col.put(number,col.getOrDefault(number,0)+1);
            set.add(number);
        }
        // System.out.println(row);
        // System.out.println(col);
        int ans = 0;
        for(String s : set){
            if(row.get(s)!=null && col.get(s)!=null){
                ans += row.get(s)*col.get(s);
            }
        }
        return ans;
    }
}