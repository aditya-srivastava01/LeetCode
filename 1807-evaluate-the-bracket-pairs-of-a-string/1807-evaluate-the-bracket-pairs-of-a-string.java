class Solution {
    public String evaluate(String s, List<List<String>> know) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<know.size();i++){
            map.put("("+know.get(i).get(0)+")",know.get(i).get(1));
        }
        char[] str = s.toCharArray();
        List<Character> ans = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                String key = "";
                for(int j=i;j<str.length;j++){
                    if(str[j]==')'){
                        key += ')';
                        if(map.get(key)==null){
                            ans.add('?');
                        }else{
                            for(char c : map.get(key).toCharArray()){
                                ans.add(c);
                            }
                        }
                        i=j;
                        break;
                    }
                    key += str[j];
                }
                
            }else{
                ans.add(str[i]);
            }
        }
        // System.out.println(ans);
        char[] res = new char[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        
        return String.valueOf(res);
    }
}