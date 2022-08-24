import java.util.*;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int[] ope:operations){
            int indx = map.get(ope[0]);
            map.remove(nums[indx]);
            nums[indx] = ope[1];
            map.put(ope[1],indx);
        }
        return nums;
    }
}