import java.util.*;
class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2==1){
            return new int[0];
        }
        Arrays.sort(changed);
        Hashtable<Integer, PriorityQueue<Integer>> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            if(map.get(changed[i])==null){
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(i);
                map.put(changed[i],pq);
            }
            else{
                PriorityQueue<Integer> pq = map.get(changed[i]);
                pq.add(i);
                map.put(changed[i],pq);
            }
        }
        int ans[] = new int[n/2];
        int indx = 0;
        for(int i=0;i<n;i++){
            int x = changed[i];
            if(x!=-1){
                if(map.containsKey(2*x) && map.get(2*x).size()>0){
                    if(x==0){
                        PriorityQueue<Integer> pq = map.get(2*x);
                        if(pq.size()>1){
                            ans[indx] = x;
                            pq.poll();
                            changed[pq.poll()] =-1;
                            map.put(x,pq);
                        }else{
                            return new int[0];
                        }
                    }
                    else{
                        ans[indx] = x;
                        PriorityQueue<Integer> pq = map.get(2*x);
                        changed[pq.poll()] = -1;
                        if(pq.size()==0){
                            map.remove(2*x);
                        }else{
                            map.put(2*x,pq);
                        }                          
                    }     
                    indx++;
                    if(indx==n/2){
                        return ans;
                    }
                }
                else{
                    return new int[0];
                }
            }
        }
        return ans;
    }
}