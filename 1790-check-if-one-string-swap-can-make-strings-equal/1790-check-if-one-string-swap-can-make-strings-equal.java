class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int nonequal = 0;
        char[] one = new char[2];
        char[] two = new char[2];
        int k = 0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                nonequal++;
                if(nonequal>2){
                    return false;
                }
                one[k] = s1.charAt(i);
                two[k] = s2.charAt(i);
                k++;
            }
            if(nonequal>2){
                return false;
            } 
        }
        Arrays.sort(one);
        Arrays.sort(two);
        for(int i=0;i<2;i++){
            if(one[i]!=two[i]){
                return false;
            }
        }
        return true;
    }
}