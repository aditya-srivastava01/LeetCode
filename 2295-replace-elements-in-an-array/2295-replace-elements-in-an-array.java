import java.util.*;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int[] ope:operations){
            nums[map.get(ope[0])] = ope[1];
            map.put(ope[1],map.get(ope[0]));
        }
        return nums;
    }
}