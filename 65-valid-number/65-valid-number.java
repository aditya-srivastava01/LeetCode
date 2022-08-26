import java.math.*;
class Solution {
    public boolean isNumber(String s) {
        try{
            BigInteger check = new BigInteger(s);
            return true;
        }catch(Exception e){
            try{
                BigDecimal check = new BigDecimal(s);
                return true;
            }catch(Exception d){
                String msg = d.getMessage();
                return "Too many nonzero exponent digits.".equals(msg) || "Exponent overflow.".equals(msg);
            }
        }
    }
}