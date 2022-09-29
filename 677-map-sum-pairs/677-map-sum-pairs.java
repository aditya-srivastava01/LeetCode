class MapSum {
    HashMap<String,Integer> map = new HashMap<>();
    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int ans = 0;
        for(String s : map.keySet()){
            if(s.startsWith(prefix)){
                ans += map.get(s);
            }
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */