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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode();
        ListNode copy = head;
        ListNode temp = ans;
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        int i = 0;
        while(copy!=null){
            if(i!=size-n){
                temp.next = new ListNode(copy.val);
                temp = temp.next;
            }
            i++;
            copy = copy.next;
        }
        return ans.next;
    }
}