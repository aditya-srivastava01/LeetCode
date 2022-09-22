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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode root = head;
        int n = 1;
        while(root.next!=null){
            root = root.next;
            n++;
        }
        root.next = head;
        for(int i=0;i<n-k%n;i++){
            root = root.next;
        }
        head = root.next;
        root.next  = null;
        return head;
    }
}