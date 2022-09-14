import java.util.*;
class Solution {
    Hashtable<Integer,int[]> map = new Hashtable<>();
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int res[] : matches){
            if(map.get(res[0])==null){
                map.put(res[0],new int[] {1,0});
            }else{
                int[] arr = map.get(res[0]);
                arr[0]++;
                map.put(res[0],arr);
            }
            if(map.get(res[1])==null){
                map.put(res[1],new int[] {0,1});
            }else{
                int[] arr = map.get(res[1]);
                arr[1]++;
                map.put(res[1],arr);
            }
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i : list){
            int[] res = map.get(i);
            if(res[1]==0){
                zero.add(i);
            }
            if(res[1]==1){
                one.add(i);
            }
        }
        ans.add(zero);
        ans.add(one);
        return ans;
    }
}