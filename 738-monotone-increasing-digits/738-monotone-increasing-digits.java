class Solution {
    public int monotoneIncreasingDigits(int n) {
        int len = size(n);
        int[] dig = new int[len];
        len--;
        while(n>0){
            dig[len] = n%10;
            n /= 10;
            len--;
        }
        n = dig.length;
        int t = 10;
        while(t>0){
            for(int i=0;i<n-1;i++){
                if(dig[i]>dig[i+1]){
                    dig[i]--;
                    for(int j=i+1;j<n;j++){
                        dig[j]=9;
                    }
                    break;
                }
            }
            t--;
        }
        int ans = 0;
        
        for(int i=0;i<n;i++){
            ans += dig[i]*(int)Math.pow(10,n-i-1);
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
        return 10;
    }
}

