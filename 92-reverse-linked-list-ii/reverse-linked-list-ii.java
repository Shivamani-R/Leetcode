class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode previous = dummy; 
        
        for (int i = 0; i < left - 1; i++)
            previous = previous.next;
        
        ListNode present = previous.next;
        
        for (int i = 0; i < right - left; i++) {
            ListNode next = present.next;
            present.next = next.next;
            next.next = previous.next;
            previous.next = next;
        }
        
        return dummy.next;
    }
}
