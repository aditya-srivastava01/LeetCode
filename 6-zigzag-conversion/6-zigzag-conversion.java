class Solution {
    int n = 0;
    int i = 0;
    int k = 0;
    int indx = k-1;
    List<List<String>> ans = new ArrayList<>();
    List<String> list;
    char[] s;
    public String convert(String str, int k) {
        this.s = str.toCharArray();
        this.n = s.length;
        this.i = 0;
        this.k = k;
        if(n<k || k<2){
            return str;
        }
        this.indx = k-1;
        for(i=0;i<k;i++){
            list = new ArrayList<>();
            list.add(""+s[i]);
            ans.add(list);
        }
        
        solve();
        String zigzag = "";
        for(List<String> l : ans){
            zigzag += String.join("",l);
        }
        return zigzag;
    }
    public void solve(){
        if(i>=n){
            return;
        }
        while(indx>0 && i<n){
            for(int j=0;j<k;j++){
                list = ans.get(j);
                if(j==indx-1){
                    list.add(""+s[i]);
                    i++;
                }
                ans.set(j,list);
            }
            indx--;
        }     
        add();
    }
    public void add(){
        for(int j=1;j<k && i<n;j++){
            list = ans.get(j);
            list.add(""+s[i]);
            ans.set(j,list);
            i++;
        }
        indx = k-1;
        solve();
    }
}