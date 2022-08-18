class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int req = n/2;
        int count[] = new int[arr[n-1]+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        Arrays.sort(count);
        int ans = 0;
        int k = count.length-1;
        while(n>req){
            n -= count[k];
            ans++;
            k--;
        }    
        return ans;
    }
}