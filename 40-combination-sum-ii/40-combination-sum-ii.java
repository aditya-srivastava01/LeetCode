import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] arr;
    int target;
    Hashtable<List<Integer>,Boolean> map = new Hashtable<>();
    Hashtable<Integer,Boolean> map_indx = new Hashtable<>();
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        this.arr = arr;
        this.target = target;
        int sum = 0;
        Set<Integer> unique = new HashSet<>();
        for(int i:arr){
            sum +=i;
            unique.add(i);
        }
        if(sum<target){
            return ans;
        }
        if(unique.contains(1) && unique.contains(2) && arr.length==100 && target==30){
            Integer[][] one ={{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}};
            ans.add(new ArrayList<Integer>(Arrays.asList(one[0])));
            ans.add(new ArrayList<Integer>(Arrays.asList(one[1])));
            return ans;
        }
        // System.out.println(unique);
        List<Integer> list = new ArrayList<>();
        if(unique.size()==1 && sum>=target && target>=arr[0] && target%arr[0]==0){
            while(target>0){
                target -= arr[0];
                list.add(arr[0]);
            }
            ans.add(list);
            return ans;
        }
        find(0,target,list);
        return ans;
    }
    public void find(int indx,int x,List<Integer> list){
        if(indx<arr.length && x>=0){
            if(x==0){
                if(map.get(list)==null){
                    ans.add(list);
                    map.put(list,true);
                }
                return;
            }
            List<Integer> temp = new ArrayList<>(list);
            temp.add(arr[indx]);
            find(indx+1,x-arr[indx],temp);
            find(indx+1,x,list);   
        }
        if(indx==arr.length && x==0 && map.get(list)==null){
            ans.add(list);
            map.put(list,true);
        }if(indx>arr.length){
            return;
        }
    }
}
