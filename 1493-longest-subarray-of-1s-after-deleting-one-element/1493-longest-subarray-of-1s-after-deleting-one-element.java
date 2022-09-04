class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        char[] bin = new char[n];
        char dig[] = {'0','1'};
        for(int i=0;i<n;i++){
            bin[i] = dig[nums[i]];
        }
        String ans[] = String.valueOf(bin).split("0");
        n = ans.length;
        if(n==1){
            return Math.max(1,ans[0].length()-1);
        }
        int max = 0;
        for(int i=0;i<n-1;i++){
            max = Math.max(max,ans[i].length()+ans[i+1].length());
        }
        return max;
    }
}