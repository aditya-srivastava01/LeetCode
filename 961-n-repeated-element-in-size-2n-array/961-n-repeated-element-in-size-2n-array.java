class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> ban = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ban.get(nums[i])==null){
                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            }
            if(map.get(nums[i])>nums.length/2){
                ban.put(map.remove(nums[i]),0);
            }
            
        }
        for(int i : map.keySet()){
            if(map.get(i)==nums.length/2){
                return i;
            }
        }
        return 0;
    }
}