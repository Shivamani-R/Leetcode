class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        slow.next = null;
        ListNode first = head;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode present = head;
        while (present != null) {
            ListNode temp = present.next;
            present.next = previous;
            previous = present;
            present = temp;
        }
        return previous;
    }
}
