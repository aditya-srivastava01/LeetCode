/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fas = head.next;
        List<Integer> list = new ArrayList<>();
        int n = 1;
        while(slow!=null && fas.next!=null){
            list.add(slow.val);
            slow = slow.next;
            fas = fas.next.next;
            n++;
        }
        list.add(slow.val);
        slow = slow.next;
        int ans = 0;
        int i = 0;
        while(slow!=null){
            ans = Math.max(ans,list.get(n-i-1)+slow.val);
            slow = slow.next;
            i++;
        }
        return ans;
    }
}