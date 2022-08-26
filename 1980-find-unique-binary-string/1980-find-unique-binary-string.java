import java.util.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        if(n==1){
            if(nums[0].equals("0")){
                return "1";
            }
            return "0";
        }
        Hashtable<String,Boolean> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],true);
        }
        String ans = Integer.toBinaryString(0);
        char[] arr = new char[n-ans.length()];
        Arrays.fill(arr,'0');
        ans = String.valueOf(arr)+ans;
        if(map.get(ans)==null){
            return ans;
        }
        int min = (int)Math.pow(2,n-1)-2;
        int max = (int)Math.pow(2,n)-1;
        int range = max - min + 1;
        for(int x=0;x<100;x++){
            int i = (int)(Math.random() * range) + min;
            ans = Integer.toBinaryString(i);
            arr = new char[n-ans.length()];
            Arrays.fill(arr,'0');
            ans = String.valueOf(arr)+ans;
            if(map.get(ans)==null){
                return ans;
            }   
        }
        return "";
    }
}