class Solution {
    public int maximumSwap(int num) {
        int n = size(num);
        int ans = num;
        int[] dig = new int[n];
        n--;
        while(num>0){
            dig[n] = num%10;
            num /= 10;
            n--;
        }
        n = dig.length;
        for(int i=n-1;i>=0;i--){
            int max = 0;
            for(int j=0;j<i;j++){
                if(dig[i]>dig[j]){
                   
                    int temp = dig[i];
                    dig[i] = dig[j];
                    dig[j] = temp;
                    for(int k=0;k<n;k++){
                        max += dig[k]*(int)Math.pow(10,n-k-1);
                    }
                    ans = Math.max(ans,max);
                    dig[j] = dig[i];
                    dig[i] = temp;
                    // for(int x:dig){
                    //     System.out.print(x+" ");
                    // }
                    // System.out.println();
                    break;
                }
            }   
        }
        return ans;
    }
    public int size(int num){
        if(0<=num && num<10){
            return 1;
        }
        if(10<=num && num<100){
            return 2;
        }
        if(100<=num && num<1000){
            return 3;
        }
        if(1000<=num && num<10000){
            return 4;
        }
        if(10000<=num && num<100000){
            return 5;
        }
        if(100000<=num && num<1000000){
            return 6;
        }
        if(1000000<=num && num<10000000){
            return 7;
        }
        if(10000000<=num && num<100000000){
            return 8;
        }
        if(100000000<=num && num<1000000000){
            return 9;
        }
        return 0;
    }
}