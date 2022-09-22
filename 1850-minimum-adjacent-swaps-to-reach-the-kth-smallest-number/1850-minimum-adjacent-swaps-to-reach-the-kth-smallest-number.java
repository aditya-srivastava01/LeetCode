class Solution {
    char[] arr;
    public int getMinSwaps(String num, int k) {
        this.arr = num.toCharArray();
        int n = arr.length;
        for(int i=0;i<k;i++){
            next(arr);
        }
        char[] og = num.toCharArray();
        int i = 0, j = 0;
        int result = 0;
        while (i < n){
            j = i;
            while (og[j] != arr[i]){
                j += 1;
            }
            while (i < j){
                char temp = og[j];
                og[j] = og[j - 1];
                og[j - 1] = temp;
                j -= 1;
                result += 1;
            }
            i += 1;
        }
        // System.out.println(String.valueOf(arr));
        return result;
    }
    public void next(char[] arr){
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                int pos = -1;
                int diff = Integer.MAX_VALUE;
                for(int j=i;j<n;j++){
                    if(arr[j]>arr[i-1] && (arr[j]-arr[i-1])<=diff){
                        pos = j;
                        diff = arr[j]-arr[i-1];
                    }
                }
                if(pos!=-1){
                    swap(i-1,pos);
                    int j = i;
                    int len = n-1;
                    while(j<len){
                        swap(j,len);
                        j++;
                        len--;
                    }
                    return;
                }
            } 
        }
        Arrays.sort(arr);
    }
    public void swap(int i,int j){
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

}