class Solution {
    public int numberOfWeakCharacters(int[][] prop) {
        int ans = 0;
        int n = prop.length;
        Arrays.sort(prop,(a,b)->(a[0]==b[0])?Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        int max = prop[n-1][1];
        for(int i=n-1;i>=0;i--){
            if(prop[i][1]<max){
                ans++;
            }else{
                max = prop[i][1];
            }
        }
        return ans;
    }
}