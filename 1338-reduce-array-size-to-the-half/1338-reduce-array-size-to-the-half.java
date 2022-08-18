class Solution {
    public int minSetSize(int[] arr) {
        int max = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int req = n/2;
        int count[] = new int[max+1];
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