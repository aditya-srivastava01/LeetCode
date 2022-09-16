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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode ans = new ListNode();
        ListNode temp = ans;
        ListNode copy = head.next;
        while(head!=null){
            temp.next = new ListNode(head.val);
            temp = temp.next;
            if(head.next==null){
                break;
            }
            head = head.next.next;
        }
        while(copy!=null){
            temp.next = new ListNode(copy.val);
            temp = temp.next;
            if(copy.next==null){
                break;
            }
            copy = copy.next.next;
        }
        return ans.next;
    }
}