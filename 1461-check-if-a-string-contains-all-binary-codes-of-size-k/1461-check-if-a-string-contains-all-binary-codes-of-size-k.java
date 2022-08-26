import java.util.*;
class Solution {
    Hashtable<String,Boolean> map = new Hashtable<>(); 
    public boolean hasAllCodes(String str, int k) {
        char[] s = str.toCharArray();
        if(k==1){
            boolean one = false;
            boolean zero = false;
            for(int i=0;i<s.length;i++){
                if(s[i]=='1'){
                    one = true;
                }
                if(s[i]=='0'){
                    zero = true;
                }
                if(one && zero){
                    return true;
                }
            }
            return false;
        }
        
        for(int i=0;i<=s.length-k;i++){
            char[] temp = Arrays.copyOfRange(s, i, i+k);
            map.put(String.valueOf(temp),true);
        }
        System.out.println(map);
        for(int i=(int)Math.pow(2,k-1)-2;i<(int)Math.pow(2,k);i++){
            String ans = Integer.toBinaryString(i);
            if(ans.length()<k){
                char[] arr = new char[k-ans.length()];
                Arrays.fill(arr,'0');
                ans = String.valueOf(arr)+ans;
            }
            System.out.println(ans);
            if(map.get(ans)==null){
                return false;
            }
        }
        return true;
    }
}