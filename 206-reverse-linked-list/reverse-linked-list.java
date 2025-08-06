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
    public ListNode reverseList(ListNode head) {
        ListNode present = head;
        ListNode previous = null;

        while(present != null){
            ListNode nxt = present.next;
            present.next = previous;
            previous=present;
            present=nxt;
        }
        return previous;
    }
}
