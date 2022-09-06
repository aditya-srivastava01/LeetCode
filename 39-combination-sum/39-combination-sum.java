import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] arr;
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        this.arr = arr;
        List<Integer> list = new ArrayList<>();
        find(0,target,list);
        return ans;
    }
    public void find(int indx,int x,List<Integer> list){
        if(indx<arr.length && x>=0){
            if(x==0){
                ans.add(list);
                return;
            }
            List<Integer> temp = new ArrayList<>(list);
            temp.add(arr[indx]);
            find(indx,x-arr[indx],temp);
            find(indx+1,x,list);          
        }
    }
}
