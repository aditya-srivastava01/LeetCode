class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int ans[] = new int[n];
        int sum = 0;
        int i = 0;
        int m = rolls.length;
        for(i=0;i<m;i++){
            sum += rolls[i];
        }
        int req = mean*(n+m)-sum;
        if(req<n || req>n*6){
            return new int[0];
        }
        int min = 1;
        for(i=6;i>0;i--){
            if(n*i<=req){
                min = i;
                break;
            }
        }
        Arrays.fill(ans,min);
        req -= n*min;
        int cnt = 0;
        int prev = 0;
        while(req!=0){
            boolean change = false;
            for(i=0;i<n;i++){
                if(ans[i]<6){
                    change = true;
                    ans[i]++;
                    req--;
                    if(req==0){
                        return ans;
                    }
                }
                if(req==0){
                    return ans;
                }
            }
            if(!change){
                break;
            }
        }
        // System.out.println(req);
        if(req!=0){
            return new int[0];
        }
        return ans;
    }
}