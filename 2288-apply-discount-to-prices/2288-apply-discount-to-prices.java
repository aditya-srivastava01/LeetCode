import java.math.BigDecimal;
import java.math.*;
class Solution {
    public String discountPrices(String sentence, int discount) {
        // if(discount==0){
        //     return sentence;
        // }
        String[] ans = sentence.split(" ");
        for(int i=0;i<ans.length;i++){
            if(ans[i].charAt(0)=='$'){
                try{
                    if(discount==0){
                        long num =  Long.valueOf(ans[i].substring(1,ans[i].length()));
                        ans[i]+=".00";
                    }else{
                        long num =  Long.valueOf(ans[i].substring(1,ans[i].length()));
                        // System.out.println(num*(100.0-discount)/100.0);
                        BigDecimal x = new BigDecimal(String.valueOf(num*(100.0-discount)/100.0));
                        String val = x.toString();
                        System.out.println(val);
                        String[] dec = val.split("\\.");
                        if(dec.length==1){
                            String decimal = "00";
                            ans[i] = "$"+dec[0]+"."+decimal;
                        }else{
                            String decimal = dec[1]+"00";
                            ans[i] = "$"+dec[0]+"."+decimal.substring(0,2);
                        }
                     }
                    
                }catch(Exception e){
                    // System.out.println(e);
                }
            }
        }
        
        return  String.join(" ",ans);
    }
}