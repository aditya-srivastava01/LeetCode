class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[1001];
        for(int i:nums1){
            arr[i] = 1;
        }
        for(int i:nums2){
            if(arr[i]==1){
                arr[i] = 0;
                ans.add(i);
            }
        }
        
        int n = ans.size();
        int[] answer = new int[n];
        n--;
        for(int i:ans){
            answer[n] = i;
            n--;
        }
        return answer;
    }
}