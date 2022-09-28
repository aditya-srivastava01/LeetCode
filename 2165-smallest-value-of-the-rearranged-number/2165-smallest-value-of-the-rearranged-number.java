class Solution {
    public long smallestNumber(long num) {
        boolean neg = num<0l;
        if(num==0l){
            return num;
        }
        if(!neg){
            long[] dig = new long[10];
            while(num>0){
                int indx = (int)(num%10l);
                dig[indx]++;
                num /= 10l;
            }
            String ans = "";
            for(int i=1;i<10;i++){
                if(dig[i]>0){
                    for(int x=0;x<dig[i];x++){
                        ans += String.valueOf(i);
                        if(dig[0]>0){
                           for(int y=0;y<dig[0];y++){
                                ans += "0";
                            }  
                            dig[0] = 0;                           
                            }
                    }
                    dig[i] = 0;
                    // break;
                    if(dig[0]>0){
                      for(int x=0;x<dig[0];x++){
                            ans += "0";
                        }  
                        dig[0] = 0;
                    }
                    
                }
            }
            return Long.parseLong(ans);
        }
        List<Long> list = new ArrayList<>();
        num *= -1;
        while(num>0){
            list.add(num%10);
            num /= 10;
        }
        Collections.sort(list);
        long ans = 0l;
        for(int i=list.size()-1;i>=0;i--){
            ans += (list.get(i)*(long)Math.pow(10,i));
        }
        // System.out.println(list);
        return ans*-1l;
    }
}