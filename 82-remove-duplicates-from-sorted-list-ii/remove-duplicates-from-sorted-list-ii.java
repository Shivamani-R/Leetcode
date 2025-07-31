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
       ListNode ss = new ListNode(0,head);
       ListNode prev = ss;
       ListNode temp = head;
       while(temp!=null){
        if(temp.next != null && temp.val == temp.next.val){
            int dup = temp.val;
            while(temp != null && temp.val == dup){
                temp = temp.next;
            }
            prev.next=temp;
        }
        else{
            prev = temp;
            temp = temp.next;
            
        }
       }
       return ss.next;
    }
}