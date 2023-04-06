class MagicDictionary {
    HashMap<String,int[]> map = new HashMap<>();
    public MagicDictionary() {
        this.map =  new HashMap<>();
    }
    
    public void buildDict(String[] dictionary) {
        
        for(String s : dictionary){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            map.put(s,count);
        }
    }
    
    public boolean search(String word) {
        // if(map.containsKey(word)){
        //     return false;
        // }
        char[] w = word.toCharArray();
        int[] count = new int[26];
        for(char c : w){
            count[c-'a']++;
        }
        for(String s : map.keySet()){
            if(s.length()!=word.length()){
                continue;
            }
            int freq[] = map.get(s);
            if(!help(count,freq)){
                // System.out.println(word+" "+s);
                continue;
            }
            char arr[] = s.toCharArray();
            int n = arr.length;
            int cnt = 0;
            for(int i=0;i<n;i++){
                if(arr[i]!=w[i]){
                    cnt++;
                }
                if(cnt>1){
                    continue;
                }
            }
            if(cnt==1){
                return true;
            }
        }
        return false;
    }
    
    public boolean help(int[] count,int freq[]){
        for(int i=0;i<26;i++){
            if(Math.abs(count[i]-freq[i])>1){
                return false;
            }
        }
        return true;
    }
    
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */