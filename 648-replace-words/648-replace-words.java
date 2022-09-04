class Solution {
    public String replaceWords(List<String> dick, String sentence) {
        Collections.sort(dick);
        for(int i=0;i<dick.size();i++){
            int indx = 0;
            for(int j=i+1;j<dick.size();j++){
                if(dick.get(j).startsWith(dick.get(i))){
                    dick.set(j,"");
                    indx++;
                }else{
                    break;
                }
            }
            i += indx;
        }
        // System.out.println(dick);
        String[] words = sentence.split(" ");
        for(int i=0;i<dick.size();i++){
            if(dick.get(i).length()>0){
                for(int j=0;j<words.length;j++){
                    if(words[j].startsWith(dick.get(i))){
                        words[j] = dick.get(i);
                    }
                }
            }
        }
        
        return String.join(" ",words);
    }
}