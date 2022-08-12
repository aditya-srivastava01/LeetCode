import java.util.*;
class Solution {
    public String decodeMessage(String key, String msg) {
        char[] pos = new char[26];
        int[] olredi = new int[26];
        Arrays.fill(pos,' ');
        Hashtable<Character,Character> map = new Hashtable<>();
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int indx = 0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && pos[indx]==' ' && olredi[key.charAt(i)-'a']==0){
                pos[indx] = key.charAt(i);
                olredi[key.charAt(i)-'a'] = 1;
                map.put(key.charAt(i),alpha[indx]);
                indx++;
            }if(indx==26){
                break;
            }
        }
        map.put(' ',' ');
        String ans = "";
        for(int i=0;i<msg.length();i++){
            ans += map.get(msg.charAt(i));
        }
        return ans;
    }
}