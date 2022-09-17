class Solution {
    char[] s;
    HashMap<Character,Integer> map = new HashMap<>();
    public List<Integer> partitionLabels(String str) {
        List<Integer> ans = new ArrayList<>();
        this.s = str.toCharArray();
        int n = s.length;
        
        for(int i=0;i<n;i++){
            map.put(s[i],i);
        }
        // System.out.println(map);
        for(int i=0;i<n;i++){
            char first = s[i];
            // Set<Character> set = new HashSet<>();
            // set.add(first);          
            for(int j=n-1;j>=i;j--){
                if(s[j]==first){
                    // System.out.print(first+" ");
                    int indx = helper(i,j);
                    while(true){
                        int val = helper(i,indx);
                        if(indx==val){
                            break;
                        }
                        indx = val;
                    }
                    // System.out.println(indx);
                    ans.add(indx-i+1);
                    i = indx;
                    break;
                }
            }
        }
        return ans;
    }
    public int helper(int i,int n){
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(i=i;i<=n;i++){
            if(!set.contains(s[i])){
                max = Math.max(map.get(s[i]),max);
                set.add(s[i]);
            }
        }
        return max;
    }
}