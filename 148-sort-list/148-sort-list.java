class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode ans = new ListNode();
        ListNode temp = ans;
        
        while(head!=null){
            pq.add(head.val);
            head = head.next;
        }
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return ans.next;
   }
}