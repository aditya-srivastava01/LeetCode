import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        String[] ans = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = String.valueOf(nums[i]);
            
        }
        Arrays.sort(ans, (a, b) -> (b+a).compareTo(a+b));
        // System.out.println(ans);
        if(ans[0].equals("0")){
            return "0";
        }
        String res = "";
        for(String s: ans){
            res += s;
        }
        return res;
    }
}