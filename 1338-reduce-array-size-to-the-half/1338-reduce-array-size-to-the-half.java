import java.util.*;
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
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = count.length;
        int ans = 0;
        for(int i=0;i<k;i++){
            pq.add(count[i]);
        }
        while(n>req){
            n -= pq.peek();
            ans++;
            pq.remove(pq.peek());
        }    
        return ans;
    }
}