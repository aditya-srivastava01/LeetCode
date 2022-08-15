class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int[] ans = {0};
        char[] arr = s.toCharArray();
        replace(arr,n,ans);
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            ans[0] += give(arr[i]);
        }
        return ans[0];
    }
    public int give(char c){
        if(c=='I'){
            return 1;
        }if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10; 
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500; 
        }
        if(c=='M'){
            return 1000;
        }
        return 0;
    }
    public void replace(char[] arr,int n,int[] ans){
        for(int i=0;i<n-1;i++){
            if(arr[i]=='I' && arr[i+1]=='V'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 4;
            }
            else if(arr[i]=='I' && arr[i+1]=='X'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 9;
            }else if(arr[i]=='X' && arr[i+1]=='L'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 40;
            }else if(arr[i]=='X' && arr[i+1]=='C'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 90;
            }else if (arr[i]=='C' && arr[i+1]=='D'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 400;
            }else if (arr[i]=='C' && arr[i+1]=='M'){
                arr[i] = '0';
                arr[i+1] = '0';
                ans[0] += 900;
            }
        }
    }
}