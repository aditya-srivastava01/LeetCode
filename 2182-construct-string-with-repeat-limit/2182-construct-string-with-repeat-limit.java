class Solution {
    public String repeatLimitedString(String str, int k) {
        int[] count = new int[26];
        char[] ans = str.toCharArray();
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int n = ans.length;
        for(int i=0;i<n;i++){
            count[ans[i]-'a']++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<26;i++){
            if(count[i]>0){
                pq.add(new int[] {i,count[i]});
            }
        }
        
        int[] largest = pq.poll();
        int cnt = Math.min(k,largest[1]);
        largest[1] -= cnt;
        int indx = 0;
        Arrays.fill(ans,indx,indx+cnt,alpha[largest[0]]);  
        indx += cnt;
        while(!pq.isEmpty()){
            int[] second_largest = pq.poll();
            if(largest==null || largest[1]==0){
                cnt = Math.min(k,second_largest[1]);
            }else{
                cnt = Math.min(1,second_largest[1]);
            }   
            second_largest[1] -= cnt;
            if(second_largest[1]>0){
                pq.add(second_largest);
            }
            Arrays.fill(ans,indx,indx+cnt,alpha[second_largest[0]]);
            indx += cnt;
            if(largest[1]==0 && !pq.isEmpty()){
                largest = pq.poll();
            }
            if(largest[0]!=second_largest[0]){
                cnt = Math.min(largest[1],k);
                largest[1] -= cnt;
                Arrays.fill(ans,indx,indx+cnt,alpha[largest[0]]);
                indx+=cnt;          
            }
        }
        if(largest!=null && alpha[largest[0]]!=ans[indx-1]){
            cnt = Math.min(largest[1],k);
            largest[1] -= cnt;
            Arrays.fill(ans,indx,indx+cnt,alpha[largest[0]]);
            indx += cnt;              
        }
        return String.valueOf(ans).substring(0,indx);
    }
}