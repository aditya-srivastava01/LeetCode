import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i= 0;i<mat.length;i++){
            int one = 0;
            for(int j=0;j<mat[0].length;j++){
                one += mat[i][j];
            }
            if(map.get(one)!=null){
                ArrayList<Integer> arr = map.get(one);
                arr.add(i);
                map.put(one,arr);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                map.put(one,arr);
            }
        }int ans[] = new int[k];
        int pos = 0;
         ArrayList<Integer> set = new ArrayList<>(map.keySet());
        Collections.sort(set);
        for(int key : set){
            for(int i : map.get(key)){
                // System.out.print(i+" ");
                ans[pos] = i;
                pos++;
                k--;
                if(k==0 || pos==ans.length){
                    break;
                }
            }
            if(k==0 || pos==ans.length){
                break;
            }
        }
        // System.out.println();
        // System.out.println(map);
        return ans;
    }
}