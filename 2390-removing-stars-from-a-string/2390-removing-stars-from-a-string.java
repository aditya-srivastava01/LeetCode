class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='*'){
                st.pop();
            }
            else{
                st.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}