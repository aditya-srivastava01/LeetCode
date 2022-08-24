import java.util.*;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            n = Math.max(n,nums[i]);
        }
        for(int[] arr:operations){
            n = Math.max(n,arr[1]);
        }
        int[] arr = new int[n+1];
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