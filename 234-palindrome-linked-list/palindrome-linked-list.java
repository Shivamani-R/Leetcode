class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firsth=head;
        ListNode secondh=reverse(slow);

        while(secondh!=null){
            if(secondh.val!=firsth.val){
                return false;
            }
            firsth=firsth.next;
            secondh=secondh.next;
        }
        return true;
        
    }
    private ListNode reverse(ListNode head){
        ListNode previous=null;
        ListNode present=head;

        while(present!=null){
            ListNode temp=present.next;
            present.next=previous;
            previous=present;
            present=temp;
        }
        return previous;
    }
}