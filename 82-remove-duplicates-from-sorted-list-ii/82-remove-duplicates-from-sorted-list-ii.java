class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(head!=null){
            int val = head.val;
            boolean dup = false;
            head = head.next;
            while(head!=null && head.val==val){
                dup = true;
                head = head.next;
            }
            if(!dup){
                temp.next = new ListNode(val);
                temp = temp.next;               
            }
        }
        return ans.next;
        
    }
}