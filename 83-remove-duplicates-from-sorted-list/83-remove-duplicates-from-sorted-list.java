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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = new ListNode();
        ListNode temp = start;
        while(head!=null){
            int val = head.val;
            temp.next = new ListNode(val);
            temp = temp.next;
            while(head!=null && head.val==val){
                head = head.next;
            }
            // head = head.next;
        }
        return start.next;
    }
}