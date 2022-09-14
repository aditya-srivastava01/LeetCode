import java.util.*;
class Solution {
    int ans = 0;
    String alpha[] = {"0","1","2","3","4","5","6","7","8","9"};
    Hashtable<String,Boolean> map = new Hashtable<>();
    public int pseudoPalindromicPaths (TreeNode root) {
        inorder(root,new int[10]);
        return ans;
    }
    public void inorder(TreeNode root,int[] arr){
        if(root!=null && root.left==null && root.right==null){
            int[] count = Arrays.copyOf(arr,10);
            count[root.val]++;
            int val = check(count);
            ans += val;
            return;
        }
        if(root==null){
            return;
        }
        int[] count = Arrays.copyOf(arr,10);
        count[root.val]++;
        inorder(root.left,count);
        inorder(root.right,count);
    }
    public int check(int[] arr){
        int odd = 0;
        for(int i=0;i<10;i++){
            if(arr[i]%2==1){
                odd++;
            }
            if(odd>1){
                return 0;
            }
        }
        if(odd>1){
            return 0;
        }
        return 1;
    }
}