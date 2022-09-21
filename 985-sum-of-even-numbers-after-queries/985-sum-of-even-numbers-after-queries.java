class Solution {
    // HashMap<Integer,Integer> map = new HashMap<>();
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ans[] = new int[queries.length];
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            sum += (nums[i]%2==0)?nums[i]:0; 
        }
        int i = 0;
        for(int[] q : queries){
            int indx = q[1];
            int val = q[0];
            int num = nums[indx];
            if(num%2==0){
                if((val&1)==1){
                    sum -= num;
                }else{
                    sum += val;
                }
            }else{
                if((val&1)==1){
                    sum += (num+val);
                }
            }
            nums[indx] += val;
            ans[i] = sum;
            i++;
        }
        return ans;
    }
}