class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.size();
        int len = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<nums.get(i).size();j++){
                if(i+j>=ans.size()){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums.get(i).get(j));
                    ans.add(list);
                }else{
                    List<Integer> list = ans.get(i+j);
                    list.add(0,nums.get(i).get(j));
                    ans.set(i+j,list);
                }
                len++;
            }
        }
        // System.out.println(len+"  :   "+ans);
        int[] res = new int[len];
        int i = 0;
        for(List<Integer> list : ans){
            for(int x : list){
                res[i] = x;
                i++;
            }
        }
        return res;
    }
}