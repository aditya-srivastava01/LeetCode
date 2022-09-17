class Solution {
    public String reformatDate(String d) {
        HashMap<String,String> map = new HashMap<>();
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i=0;i<9;i++){
            map.put(month[i],"0"+String.valueOf(i+1));
        }
        for(int i=9;i<12;i++){
            map.put(month[i],String.valueOf(i+1));
        }        
        String[] date = d.split(" ");
        List<String> ans = new ArrayList<>();
        ans.add(date[2]);
        ans.add(map.get(date[1]));
        try{
            ans.add(String.valueOf(Integer.valueOf(date[0].substring(0,2))));
        }catch(Exception e){
            ans.add("0"+String.valueOf(Integer.valueOf(date[0].substring(0,1))));
        }
        return String.join("-",ans);
    }
}