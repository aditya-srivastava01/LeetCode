class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        int t = 1000;
        while(t-->0){
            for(int i=0;i<ast.length-1;i++){
                if(ast[i]>0 && ast[i+1]<0){
                    if(Math.abs(ast[i])<Math.abs(ast[i+1])){
                        ast[i] = ast[i+1];
                        ast[i+1] = 0;
                    }else if(Math.abs(ast[i])>Math.abs(ast[i+1])){
                        ast[i+1] = ast[i];
                        ast[i] = 0;
                    }else{
                        ast[i] = 0;
                        ast[i+1] = 0;
                    }
                    i++;
                }
            }
            int zero = 0;
            for(int i:ast){
                zero += (i==0)?1:0;
            }
            int ans[] = new int[ast.length-zero];
            int k = 0;
            for(int i=0;i<ast.length;i++){
                if(ast[i]!=0){
                    ans[k] = ast[i];
                    k++;
                }
            }
            ast = ans;
        }
        int zero = 0;
        for(int i:ast){
            zero += (i==0)?1:0;
        }
        // System.out.println(zero);
        int ans[] = new int[ast.length-zero];
        int k = 0;
        for(int i=0;i<ast.length;i++){
            if(ast[i]!=0){
                ans[k] = ast[i];
                k++;
            }
        }
        return ans;
    }
}