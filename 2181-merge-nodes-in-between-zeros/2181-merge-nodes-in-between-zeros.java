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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int count = 0;
        List<Integer> val = new ArrayList<>();
        while(head!=null){
            if(head.val==0){
                int tot = 0;
                head = head.next;
                while(head!=null && head.val!=0){
                    tot += head.val;
                    head = head.next;
                }
                if(tot!=0){
                    ListNode var = new ListNode(tot);
                    temp.next = var;
                    temp = temp.next;
 
                }
            }
        }
        return ans.next;
    }
}