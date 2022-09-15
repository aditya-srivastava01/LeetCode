class Solution {
    public String evaluate(String s, List<List<String>> know) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<know.size();i++){
            map.put("("+know.get(i).get(0)+")",know.get(i).get(1));
        }
        char[] str = s.toCharArray();
        // List<Character> ans = new ArrayList<>();
        char[] ans = new char[2*1_0_0_0_0_0];
        int indx = 0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                String key = "";
                for(int j=i;j<str.length;j++){
                    if(str[j]==')'){
                        key += ')';
                        if(map.get(key)==null){
                            // ans.add('?');
                            ans[indx] = '?';
                            indx++;
                        }else{
                            for(char c : map.get(key).toCharArray()){
                                ans[indx] = c;
                                // ans.add(c);
                                indx++;
                            }
                        }
                        i=j;
                        break;
                    }
                    key += str[j];
                }
                
            }else{
                ans[indx] = str[i];
                indx++;
                // ans.add(str[i]);
            }
        }
        // System.out.println(ans);
        // char[] res = new char[ans.size()];
        // for(int i=0;i<ans.size();i++){
        //     res[i] = ans.get(i);
        // }
        char[] res = Arrays.copyOf(ans,indx);
        return String.valueOf(res);
    }
}