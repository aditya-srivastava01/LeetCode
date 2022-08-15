import java.util.*;
class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        if(n==1 || m==1){
            if(num1.equals("0") || num2.equals("0")){
                return "0";
            }
        }
        if(n<m){
            String temp = num1;
            int swap = n;
            num1 = num2;
            num2 = temp;
            n = m;
            m = swap;
        }
        Hashtable<Character,String> map = new Hashtable<>();
        char[] num = num1.toCharArray();
        char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        // List<String>ans = new ArrayList<>();
        String ans = "0";
        for(int i=0;i<10;i++){
            map.put(digits[i],multiply(num,digits[i]));
            // System.out.println(multiply(num,num2.charAt(i)));
        }
        int z = 0;
        for(int i=m-1;i>=0;i--){
            char[] zero = new char[z];
            Arrays.fill(zero,'0');
            ans = addstr(ans,map.get(num2.charAt(i))+String.valueOf(zero));
            z++;
        }
        // for(String i: ans){
        //     System.out.println(i);
        // }
        return ans;
    }
    public String multiply(char[] num,char c){
        int n = num.length;
        char[] ans = new char[n+1];
        char crr = '0';
        int pos = n;
        for(int i=n-1;i>=0;i--){
            char[] res = String.valueOf((num[i]-'0')*(c-'0')+crr-'0').toCharArray();
            if(res.length>1){
                crr = res[0];
                ans[pos] = res[1];
            }
            else{
                crr = '0';
                ans[pos] = res[0];
            }
            pos--;
        }if(crr!='0'){
            ans[pos] = crr;
        }
        String res = "";
        for(char x : ans){
            if(x>='0'){
                res+=x;
            }
        }
        // return String.valueOf(ans);
        return res;
    }
    public String addstr(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        StringBuilder str = new StringBuilder();
        int sum = 0;
        
        while( i>=0 || j >= 0 || sum != 0){
            
            if(i >= 0){
                sum += Character.getNumericValue(num1.charAt(i));
                i--;
            }
            
            if(j >= 0){
                sum += Character.getNumericValue(num2.charAt(j));
                j--;
            }
            
            str.append(sum%10);
            sum /= 10;
        }
        
        return str.reverse().toString();
    }
}