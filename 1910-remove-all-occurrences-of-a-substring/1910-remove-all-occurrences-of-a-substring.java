class Solution {
    
    public String removeOccurrences(String s, String p) {
        List<Character> arr = new ArrayList<>();
        
        for(char c : s.toCharArray()){
            arr.add(c);
        }
        
        char[] part = p.toCharArray();
        
        boolean found = true;
        int size = arr.size();
        while(found){
            remove(arr,part);
            if(size==arr.size()){
                found = false;
            }size = arr.size();
        }

        String ans = "";
        for(char c : arr){
            ans += c;
        }
        return ans;
    }
    public void remove(List<Character> arr,char[] part){
        int n = arr.size();
        boolean thereis = false;
        for(int i=0;i<n;i++){
            boolean is = true;
            if(part[0]==arr.get(i) && i+part.length-1<n){
                for(int j=0;j<part.length;j++){
                    if(part[j]!=arr.get(i+j)){
                        is = false;
                    }
                }
            }else{
                is = false;
            }
            if(is){
                for(int j=0;j<part.length;j++){
                    arr.remove(i);
                } 
                break;
            }
        }
    }
}