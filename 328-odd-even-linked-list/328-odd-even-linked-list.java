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
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        // int first = head.val%2;
        int indx = 1;
        while(head!=null){
            int val = head.val;
            if(indx%2==0){
                even.add(val);
            }else{
                odd.add(val);
            }
            head = head.next;
            indx++;
        }
        
        ListNode ans = new ListNode();
        ListNode temp = ans;
        for(int i : odd){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        for(int i : even){
            temp.next = new ListNode(i);
            temp = temp.next;
        }  
        return ans.next;
    }
}