class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        List<String> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(str[i].length()>0){    
                list.add(str[i]);
            }    
        }
        // Collections.reverse(list);
        return String.join(" ",list);
    }
}