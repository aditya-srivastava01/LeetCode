class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        int n = img.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int left = (img[i][j]==0)?1:0;
                int right = (img[i][n-j-1]==0)?1:0;
                img[i][j] = right;
                img[i][n-j-1] = left;
            }
            if(n%2==1){
                img[i][n/2] = img[i][n/2]==0?1:0; 
            }
        }
        return img;
    }
}