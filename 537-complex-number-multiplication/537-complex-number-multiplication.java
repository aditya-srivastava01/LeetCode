class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] one = num1.split("\\+");
        String[] two = num2.split("\\+");
        int a = Integer.valueOf(one[0]);
        int b = Integer.valueOf(one[1].replace("i",""));
        int c = Integer.valueOf(two[0]);
        int d = Integer.valueOf(two[1].replace("i",""));
        return String.valueOf(a*c-b*d)+"+"+String.valueOf(b*c+a*d)+"i";
    }
}