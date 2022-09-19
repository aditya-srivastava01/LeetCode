class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: paths){
            String dir[] = s.split(" ");
            String root = dir[0];
            for(int i=1;i<dir.length;i++){
                String temp[] = dir[i].split("\\(");
                String key = temp[1].substring(0,temp[1].length()-1);
                if(map.get(key)==null){
                    List<String> list = new ArrayList<>();
                    String value = root+"/"+temp[0];
                    list.add(value);
                    map.put(key,list);
                }else{
                    List<String> list = map.get(key);
                    String value = root+"/"+temp[0];
                    list.add(value);
                    map.put(key,list);                    
                }
            }
        }
        for(String key : map.keySet()){
            if(map.get(key).size()>1){
                ans.add(map.get(key));
            }
        }
        return ans;
    }
}