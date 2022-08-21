class Solution {
    int[][] two = {{1}, {2}, {4}, {8}, {1, 6}, {2, 3}, {4, 6}, {1, 2, 8}, {2, 5, 6}, {1, 2, 5}, {0, 1, 2, 4}, {0, 2, 4, 8}, {0, 4, 6, 9}, {1, 2, 8, 9}, {1, 3, 4, 6, 8}, {2, 3, 6, 7, 8}, {3, 5, 5, 6, 6}, {0, 1, 1, 2, 3, 7}, {1, 2, 2, 4, 4, 6}, {2, 2, 4, 5, 8, 8}, {0, 1, 4, 5, 6, 7, 8}, {0, 1, 2, 2, 5, 7, 9}, {0, 1, 3, 4, 4, 4, 9}, {0, 3, 6, 8, 8, 8, 8}, {1, 1, 2, 6, 6, 7, 7, 7}, {2, 3, 3, 3, 4, 4, 5, 5}, {0, 1, 4, 6, 6, 7, 8, 8}, {1, 1, 2, 2, 3, 4, 7, 7, 8}, {2, 3, 4, 4, 5, 5, 6, 6, 8}, {0, 1, 2, 3, 5, 6, 7, 8, 9}};
    public boolean reorderedPowerOf2(int n) {
        int size = size(n);
        int[] dig = new int[size];
        int i = 0;
        while(n>0){
            dig[i] = n%10;
            n /= 10;
            i++;
        }
        Arrays.sort(dig);
        // for(int x:dig){
        //     System.out.print(x+" ");
        // }
        // System.out.println();
        for(int[] arr:two){
            if(size==arr.length){
                if(Arrays.equals(arr,dig)){
                    return true;
                }
            }
        }
        return false;
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