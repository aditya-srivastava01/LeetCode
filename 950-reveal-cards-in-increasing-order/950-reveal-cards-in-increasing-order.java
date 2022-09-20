class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> index = new LinkedList();
        int[] ans = new int[n];
        Arrays.sort(deck);
        for(int i=0;i<n;i++){
            index.add(i);
        }
        // System.out.println(index);
        for(int i=0;i<n;i++){
            ans[index.pollFirst()] = deck[i];
            if(index.size()>0){
                index.add(index.pollFirst());
                // System.out.println(index);
            }
        }
        
        return ans;
    }
}