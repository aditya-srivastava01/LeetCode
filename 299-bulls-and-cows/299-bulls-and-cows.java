class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int n = s.length;
        for(int i=0;i<n;i++){
            if(s[i]==g[i]){
                a++;
                s[i] = '-';
                g[i] = '+';
            }else{
                map1.put(s[i],map1.getOrDefault(s[i],0)+1);
                map2.put(g[i],map2.getOrDefault(g[i],0)+1);
            }
        }
        for(char c : map2.keySet()){
            if(map1.containsKey(c)){
                b += Math.min(map1.get(c),map2.get(c));
            }
        }
        String ans = ""+a+"A"+b+"B";
        return ans;
    }
}