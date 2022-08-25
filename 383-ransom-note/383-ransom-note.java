class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransome[] = new int[26];
        int mag[] = new int[26];
        for(char c : ransomNote.toCharArray()){
            ransome[c-97]++;
        }
        for(char c : magazine.toCharArray()){
            mag[c-97]++;
        }
        for(int i=0;i<26;i++){
            if(ransome[i]>mag[i]){
                return false;
            }
        }
        return true;
    }
}