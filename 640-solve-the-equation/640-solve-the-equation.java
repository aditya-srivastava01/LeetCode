class Solution {
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

        int x = 0;
        int val = 0;

        for(i=0;i<lhs.length;i++){
            if(lhs[i].equals("x")){
                x++;
            }
            if('0'<=lhs[i].charAt(0) && lhs[i].charAt(0)<='9'){
                if(i+1<lhs.length && lhs[i+1].equals("x")){
                    x +=Integer.valueOf(lhs[i]);
                    i++;
                }
                else{
                    val += Integer.valueOf(lhs[i]);
                }
            }
            if(lhs[i].equals("+")){
                if(lhs[i+1].equals("x")){
                    x++;
                    i++;
                }else{
                    if(i+2<lhs.length){
                        if(lhs[i+2].equals("x")){
                            x += Integer.valueOf(lhs[i+1]);
                            i+=2;
                        }else{
                            val += Integer.valueOf(lhs[i+1]);
                            i++;
                        }
                    }else{
                        val += Integer.valueOf(lhs[i+1]);
                        i++;
                    }
                }
            }
            if(lhs[i].equals("-")){
                if(lhs[i+1].equals("x")){
                    x--;
                    i++;
                }else{
                    if(i+2<lhs.length){
                        if(lhs[i+2].equals("x")){
                            x -= Integer.valueOf(lhs[i+1]);
                            i+=2;
                        }else{
                            val -= Integer.valueOf(lhs[i+1]);
                            i++;
                        }
                    }else{
                        val -= Integer.valueOf(lhs[i+1]);
                        i++;
                    }
                }
            }
        }
        // System.out.println(x+" "+val);
        
        for(i=0;i<rhs.length;i++){
            if(rhs[i].equals("x")){
                x--;
            }
            if('0'<=rhs[i].charAt(0) && rhs[i].charAt(0)<='9'){
                if(i+1<rhs.length && rhs[i+1].equals("x")){
                    x -= Integer.valueOf(rhs[i]);
                    i++;
                }
                else{
                    val -= Integer.valueOf(rhs[i]);
                }
            }
            if(rhs[i].equals("-")){
                // System.out.println("THYT");
                if(rhs[i+1].equals("x")){
                    x++;
                    i++;
                }else{
                    if(i+2<rhs.length){
                        // System.out.println("Yaha Potty"+" i "+rhs.length);
                        if(rhs[i+2].equals("x")){
                            x += Integer.valueOf(rhs[i+1]);
                            i+=2;
                        }else{
                            val += Integer.valueOf(rhs[i+1]);
                            i++;
                        }
                    }else{
                        val +=Integer.valueOf(rhs[i+1]);
                        i++;
                    }
                }
            }
            if(rhs[i].equals("+")){
                if(rhs[i+1].equals("x")){
                    x--;
                    i++;
                }else{
                    if(i+2<rhs.length){
                        if(rhs[i+2].equals("x")){
                            x -= Integer.valueOf(rhs[i+1]);
                            i+=2;
                        }else{
                            val -= Integer.valueOf(rhs[i+1]);
                            i++;
                        }
                    }else{
                        val -= Integer.valueOf(rhs[i+1]);
                        i++;
                    }
                }
            }
        }
        // System.out.println(x+" "+val);
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
}