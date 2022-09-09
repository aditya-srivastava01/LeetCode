class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i=1;i<=n;i+=2){
            int prefix = 0;
            for(int j=0;j<i;j++){
                prefix+= arr[j];
            }
            ans += prefix;
            for(int j=i;j<n;j++){
                prefix -= arr[j-i];
                prefix += arr[j];
                ans += prefix;
            }
           
        }
        return ans;
    }
}