class Solution {
    public int lastRemaining(int n) {
        return ((Integer.highestOneBit(n) - 1) & (n | 0x55555555)) + 1;
    }
}