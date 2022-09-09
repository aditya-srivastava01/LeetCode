import java.util.*;
class Solution {
    public String freqAlphabets(String s) {
        Hashtable<String,String> map = new Hashtable<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","e");
        map.put("6","f");
        map.put("7","g");
        map.put("8","h");
        map.put("9","i");
        map.put("10#","j");
        map.put("11#","k");
        map.put("12#","l");
        map.put("13#","m");
        map.put("14#","n");
        map.put("15#","o");
        map.put("16#","p");
        map.put("17#","q");
        map.put("18#","r");
        map.put("19#","s");
        map.put("20#","t");
        map.put("21#","u");
        map.put("22#","v");
        map.put("23#","w");
        map.put("24#","x");
        map.put("25#","y");
        map.put("26#","z");
        String arr[] = {"1","2","3", "4", "5", "6", "7", "8", "9","10#", "11#", "12#", "13#", "14#", "15#", "16#", "17#", "18#", "19#", "20#", "21#", "22#", "23#", "24#","25#", "26#"};
        for(int i=25;i>=0;i--){
            s = s.replace(arr[i],map.get(arr[i]));
        }
        return s;
    }
}