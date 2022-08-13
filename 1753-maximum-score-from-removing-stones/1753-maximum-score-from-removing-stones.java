class Solution {
    public int maximumScore(int a, int b, int c) {
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int maxed = 0;
        int mined = 0;
        if(a==max){
            maxed++;
        }if(b==max){
            maxed++;
        }if(c==max){
            maxed++;
        }
        if(a==min){
            mined++;
        }if(b==min){
            mined++;
        }if(c==min){
            mined++;
        }
        int ans = 0;
        if(maxed==2){
            ans += max+min/2;
            return ans;
        }if(mined==2){
            ans += min+max/2;
            return ans;
        }
        if(a==b && b==c){
            return (a+b+c)/2;
        }
        ans = 0;
        // if(a!=min && a!=max){
        //     ans += a;
        //     return ans;
        // }if(b!=min && b!=max){
        //     ans += b;
        //     return ans;
        // }if(c!=min && c!=max){
        //     ans += c;
        //     return ans;
        // }
        
        int[] arr = {a,b,c};
        boolean done = true;
        while(done){
            Arrays.sort(arr);
            ans++;
            arr[1]--;
            arr[2]--;
            int count = 0;
            for(int i=0;i<3;i++){
                if(arr[i]==0){
                    count++;
                }
            }if(count>=2){
                done = false;
                return ans;
                
            }
            // for(int i:arr){
            //     System.out.print(i+" ");
            // }System.out.println();
        }return ans-arr[0]-arr[1]-arr[2];
    }
}