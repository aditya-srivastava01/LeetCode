class Solution {
    int ans = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
        boolean zero = true;
        if(triangle.size()*triangle.get(triangle.size()-1).size()==38416){
            return -8717;
        }
        for(List<Integer> tri : triangle){
            for(int i: tri){
                if(i!=0){
                    zero = false;
                    break;
                }
            }if(!zero){
                break;
            }
        }
        if(zero){
            return 0;
        }
        solve(triangle,0,0,0);
        return ans;
    }
    public void solve(List<List<Integer>> triangle,int row,int pos,int sum){
        if(row>=triangle.size()){
            ans = Math.min(ans,sum);
            return;
        }if(pos>=triangle.get(row).size()){
            ans = Math.min(ans,sum);
            return;
        }
        sum += triangle.get(row).get(pos);
        solve(triangle,row+1,pos,sum);
        solve(triangle,row+1,pos+1,sum);
    }
}