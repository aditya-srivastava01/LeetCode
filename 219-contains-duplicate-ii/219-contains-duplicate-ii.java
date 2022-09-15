class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list; 
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==null){
                list = new ArrayList<>();          
            }else{
                list = map.get(nums[i]);
            }
            list.add(i);
            map.put(nums[i],list);
        }
        for(int i : map.keySet()){
            if(map.get(i).size()>1){
                list = map.get(i);
                for(int x =0;x<list.size();x++){
                    for(int y = x+1;y<list.size();y++){
                        if(Math.abs(list.get(x)-list.get(y))<=k){
                            // System.out.println(i+" "+list.get(x)+" "+list.get(y));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}