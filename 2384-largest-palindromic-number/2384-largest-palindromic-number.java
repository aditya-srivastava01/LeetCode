class Solution {
    public String largestPalindromic(String num) {
        int[] dig = new int[10];
        int n = num.length();
        // System.out.println(n+"\n");
        char[] arr = num.toCharArray();
        for(int i=0;i<n;i++){
            dig[arr[i]-'0']++;
        }
        char[] digit = "0123456789".toCharArray();
        String front = "";
        
        for(int i=9;i>=0;i--){
            if(dig[i]!=0){
                if(dig[i]%2==1){
                    if(dig[i]>2){
                        if(digit[i]=='0' && front.length()>0){
                            char[] temp = new char[(dig[i]-1)/2];
                            Arrays.fill(temp,digit[i]);
                            front += String.valueOf(temp);
                            dig[i] = 1;                       
                        }
                        if(digit[i]!='0'){
                            char[] temp = new char[(dig[i]-1)/2];
                            Arrays.fill(temp,digit[i]);
                            front += String.valueOf(temp);
                            dig[i] = 1;                      
                        }
                    }   
                }else{
                    if(digit[i]=='0' && front.length()>0){
                        char[] temp = new char[(dig[i])/2];
                        Arrays.fill(temp,digit[i]); 
                        front += String.valueOf(temp);
                        dig[i] =0;
                    }if(digit[i]!='0'){
                        char[] temp = new char[(dig[i])/2];
                        Arrays.fill(temp,digit[i]);
                        front += String.valueOf(temp);
                        dig[i] =0;                  
                    }
  
                }
            }
        }
        boolean mid = false;
        for(int i=9;i>=0;i--){
            if(dig[i]==1){
                mid  = true;
                front+= digit[i];
                break;
            }
        }
        if(front.length()==0){
            return "0";
        }
        if(front.length()==1){
            return front;
        }
        // System.out.println(front);
        char[] ans = new char[100000];
        char[] f = front.toCharArray();
        int len = f.length;
        for(int i=0;i<len;i++){
            ans[i] = f[i];
        }
        int k = 0;
        int shift = 1;
        if(mid){
            shift = 2;
        }
        for(int i=len-shift;i>=0;i--){
            ans[len+k] = f[i];
            k++;
        }
        // System.out.println("Length Char Array : "+ans.length);
        // System.out.println("Length String ans : "+String.valueOf(ans).replace("\u0000", "").length());
        return String.valueOf(ans).replace("\u0000", "");
        // if(front.length()%2==0){
        //     for(int i=front.length()-2;i>=0;i--){
        //         front += front.charAt(i);
        //     }
        // }else{
        //     for(int i=front.length()-2;i>=0;i--){
        //         front += front.charAt(i);
        //     }
        // }
        // return front;
    }
}