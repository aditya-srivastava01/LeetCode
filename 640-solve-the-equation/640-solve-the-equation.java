class Solution {
    int x = 0;
    int val = 0;
    public String solveEquation(String equation) {
        String[] eq = equation.split("=");
        
        String left = eq[0];
        String right = eq[1];

        List<String> l = new ArrayList<>();
        List<String> r = new ArrayList<>();
        
        int i = 0;
        
        for(i=0;i<left.length();i++){
            char c = left.charAt(i);
            if(c=='+' || c=='-' || c=='x'){
                l.add(left.charAt(i)+"");
            }else{
                String num = "";
                int j = i;
                for(j=i;j<left.length();j++){
                    if('0'<=left.charAt(j) && left.charAt(j)<='9'){
                        num += left.charAt(j);
                    }else{
                        break;
                    }
                }
                l.add(num);
                if(j<left.length()){
                    l.add(left.charAt(j)+"");
                }
                i = j;

            }
        }
        for(i=0;i<right.length();i++){
            char c = right.charAt(i);
            if(c=='+' || c=='-' || c=='x'){
                r.add(right.charAt(i)+"");
            }else{
                String num = c+"";
                int j = i+1;
                for(j=i+1;j<right.length();j++){
                    if('0'<=right.charAt(j) && right.charAt(j)<='9'){
                        num += right.charAt(j);
                    }else{
                        break;
                    }
                }
                r.add(num);
                if(j<right.length()){
                    r.add(right.charAt(j)+"");
                }
                i = j;
            }
        }
        
        String[] lhs = new String[l.size()];
        String[] rhs = new String[r.size()];
        
        for(i=0;i<l.size();i++){
            lhs[i] = l.get(i);
        }
        for(i=0;i<r.size();i++){
            rhs[i] = r.get(i);
        }


        // System.out.println(x+" "+val);
        // System.out.println(x+" "+val);
        solve(lhs,1);
        solve(rhs,2);
        String ans = "";
        val *= -1;
        if(x==0 && val!=0){
            return "No solution";
        }
        if(x==0 && val==0){
            ans = "Infinite solutions";
        }else{
            ans = "x="+String.valueOf(val/x);
        }
        // System.out.println(x+" "+val);
        return ans;
    }
    public void solve(String[] arr,int type){
        String plus = "+";
        String minus = "-";
        if(type==2){
            plus = "-";
            minus = "+";
        }
        int i = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i].equals("x")){
                if(type==2){
                    x--;
                }
                else{
                    x++;
                }
            }
            if('0'<=arr[i].charAt(0) && arr[i].charAt(0)<='9'){
                if(i+1<arr.length && arr[i+1].equals("x")){
                    if(type==2){
                        x -=Integer.valueOf(arr[i]);
                    }else{
                        x +=Integer.valueOf(arr[i]);
                    }
                    i++;
                }
                else{
                    if(type==2){
                        val -= Integer.valueOf(arr[i]);
                    }else{
                        val += Integer.valueOf(arr[i]);
                    }
                }
            }
            if(arr[i].equals(plus)){
                if(arr[i+1].equals("x")){
                    x++;
                    i++;
                }else{
                    if(i+2<arr.length){
                        if(arr[i+2].equals("x")){
                            x += Integer.valueOf(arr[i+1]);
                            i+=2;
                        }else{
                            val += Integer.valueOf(arr[i+1]);
                            i++;
                        }
                    }else{
                        val += Integer.valueOf(arr[i+1]);
                        i++;
                    }
                }
            }
            if(arr[i].equals(minus)){
                if(arr[i+1].equals("x")){
                    x--;
                    i++;
                }else{
                    if(i+2<arr.length){
                        if(arr[i+2].equals("x")){
                            x -= Integer.valueOf(arr[i+1]);
                            i+=2;
                        }else{
                            val -= Integer.valueOf(arr[i+1]);
                            i++;
                        }
                    }else{
                        val -= Integer.valueOf(arr[i+1]);
                        i++;
                    }
                }
            }
        }
        // System.out.println(x+" "+val);
    }
}