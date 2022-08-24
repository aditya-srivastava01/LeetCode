import java.util.*;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Hashtable<Integer,Integer> map = new Hashtable<>();
        int[] arr = new int[1000001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = i;
        }
        for(int[] ope:operations){
            int indx = arr[ope[0]];
            // map.remove(nums[indx]);
            nums[indx] = ope[1];
            arr[ope[1]] = indx;
        }
        return nums;
    }
}