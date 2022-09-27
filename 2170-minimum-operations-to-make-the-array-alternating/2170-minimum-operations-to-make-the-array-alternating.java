class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> odd = new HashMap<>();
        HashMap<Integer,Integer> even = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.put(nums[i],even.getOrDefault(nums[i],0)+1);
            }else{
                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
            }
        }
        PriorityQueue<int[]> odd_val = new PriorityQueue<>((a,b)->b[1]-a[1]);
        PriorityQueue<int[]> even_val = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i:odd.keySet()){
            odd_val.add(new int[] {i,odd.get(i)});
        }
        for(int i : even.keySet()){
            even_val.add(new int[] {i,even.get(i)});
        }
        while(!odd_val.isEmpty() && !even.isEmpty()){
            int[] o = odd_val.poll();
            int[] e = even_val.poll();
            // System.out.println(o[0]+" "+o[1]);
            // System.out.println(e[0]+" "+e[1]);
            if(e[0]==o[0]){
                if(odd_val.isEmpty() && even_val.isEmpty()){
                    // System.out.println(1);
                    return n-(Math.max(e[1],o[1]));
                }else{
                    if(e[1]>o[1]){
                        if(!even_val.isEmpty() && !odd_val.isEmpty()){
                            return Math.min(n-e[1]-odd_val.poll()[1],n-o[1]-even_val.poll()[1]);
                        }
                        if(even_val.isEmpty() && !odd_val.isEmpty()){
                            return n-e[1]-odd_val.poll()[1];
                        }
                       if(!even_val.isEmpty() && odd_val.isEmpty()){
                            return n-o[1]-even_val.poll()[1];
                        }
                    }else if(e[1]<o[1]){
                        // System.out.println(3);
                        return n-o[1]-even_val.poll()[1];
                    }else{
                        if(!even_val.isEmpty() && !odd_val.isEmpty()){
                            return Math.min(n-e[1]-odd_val.poll()[1],n-o[1]-even_val.poll()[1]);
                        }
                        if(even_val.isEmpty() && !odd_val.isEmpty()){
                            return n-e[1]-odd_val.poll()[1];
                        }
                       if(!even_val.isEmpty() && odd_val.isEmpty()){
                            return n-o[1]-even_val.poll()[1];
                        }
                    }
                }
            }else{
                // System.out.println(4);
                return n-o[1]-e[1];
            }       
        }
        return 0;
        
    }
}