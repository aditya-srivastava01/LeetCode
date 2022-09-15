class Solution {
    public String evaluate(String s, List<List<String>> know) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<know.size();i++){
            map.put(know.get(i).get(0),know.get(i).get(1));
        }
        char[] str = s.toCharArray();
        // List<String> ans = new ArrayList<>();
        // char[] ans = new char[10*s.length()];
        StringBuilder ans = new StringBuilder("");
        int indx = 0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                String key = "";
                for(int j=i+1;j<str.length;j++){
                    if(str[j]==')'){
                        if(map.get(key)==null){
                            ans.append(new StringBuilder("?"));
                            // ans += "?";
                            // ans.add("?");
                            // ans[indx] = '?';indx++;
                        }else{
                            ans.append(new StringBuilder(map.get(key)));
                            // ans += map.get(key);
                            // for(char c : map.get(key).toCharArray()){
                            //     // ans[indx] = c; indx++;
                            //     // ans.add(""+c);
                            // }
                        }
                        i=j;
                        break;
                    }
                    key += str[j];
                }
                
            }else{
                ans.append(new StringBuilder(""+str[i]));
                // ans[indx] = str[i];indx++;
                // ans.add(""+str[i]);
                // ans += str[i];
            }
        }
        // char[] res = Arrays.copyOf(ans,indx);
        return String.valueOf(ans);
    }
}