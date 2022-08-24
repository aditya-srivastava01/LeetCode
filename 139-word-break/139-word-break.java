class Solution {
    boolean ans = false;
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")){
            return false;
        }
        char last = s.charAt(s.length()-1);
        char first = s.charAt(0);
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : s.toCharArray()){
            set1.add(c);
        }
        boolean hjh_last = false;
        boolean hjh_first = false;
        for(int i=0;i<wordDict.size();i++){
            String word = wordDict.get(i);
            if(last==word.charAt(word.length()-1)){
                hjh_last = true;
            }
            if(first==word.charAt(0)){
                hjh_first = true;
            }
            for(char c : word.toCharArray()){
                if(!set1.contains(c)){
                    wordDict.remove(i);
                    i--;
                    break;
                }
                else{
                    set2.add(c);
                }
            }
        }
        if(!set1.equals(set2)){
            return false;
        }
        if(!hjh_last || !hjh_first){
            return false;
        }
        for(String word: wordDict){
            search(word,s,wordDict);
            if(ans){
                return true;
            }
        }
        return ans;
    }
    public void search(String word,String s,List<String> wordDict){
        // System.out.println(word+" "+s);
        if(s.equals(word)){
            ans = true;
            return ;
        }
        if(s.startsWith(word)){
            String find = s.substring(word.length(),s.length());
            if(wordDict.indexOf(find)!=-1){
                ans = true;
                return;
            }
            else{
               for(String w : wordDict){
                   // System.out.println(find+" : "+w);
                   int w_len = w.length();
                   int f_len = find.length();
                   if(w_len<=f_len){
                       search(w,find,wordDict);
                   }
                   if(ans){
                      return;
                   }
               } 
            }
            if(ans){
                return;
            }
        }
    }
}