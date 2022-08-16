class Solution {
    public String convertToBase7(int n) {
        String ans = "";
        if(n==0){
            return "0";
        }
        List<String> list = new ArrayList<>();
        if(n<0){
              ans = "-";
            n -= 2*n;          
        }

            while(n>0){
                list.add(String.valueOf(n%7));
                n/=7;
            }
            for(int i=list.size()-1;i>=0;i--){
                ans += list.get(i);
            }
        return ans;
    }
}