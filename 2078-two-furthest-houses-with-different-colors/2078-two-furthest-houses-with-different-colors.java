import java.util.*;
class Solution {
    public int maxDistance(int[] colors) {
        int min[] = new int[101];
        Arrays.fill(min,1000);
        int max[] = new int[101];
        Arrays.fill(max,-1);
        for(int i=0;i<colors.length;i++){
            min[colors[i]] = Math.min(min[colors[i]],i);
            max[colors[i]] = Math.max(max[colors[i]],i);
        }  
        int ans = 0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(i!=j){
                    if(min[i]!=1000 && max[j]!=-1){
                        ans = Math.max(ans,Math.abs(min[i]-max[j]));
                    }
                }
            }
        }
        
        return ans;
    }
}