import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 1;
        Hashtable<Integer,Boolean> map = new Hashtable<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                map.put(nums[i],true);
                if(nums[i]>max){
                    max = nums[i];
                }
            }
        }
        if(map.size()==0){
            return ans;
        }
        for(int i=1;i<=max;i++){
            if(map.get(i)==null){
                return i;
            }
        }
        return max+1;
    }
}