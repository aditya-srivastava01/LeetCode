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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        ListNode slow = head;
        ListNode fas = head.next;
        while(slow!=null && fas!=null){
            temp.next = new ListNode(slow.val);
            temp = temp.next;
            
            slow = slow.next;
            if(fas.next==null){
                break;
            }
            fas = fas.next.next;
        }
        slow = slow.next;
        while(slow!=null){
            temp.next = new ListNode(slow.val);
            temp = temp.next;
            slow = slow.next;
        }
        return ans.next;
    }
}