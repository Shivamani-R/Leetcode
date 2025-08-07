class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0||head==null||head.next==null){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;

        ListNode newTail=head;
        int rot=k%len;
        int skip=len-rot;
        for(int i=0;i<skip-1;i++){
            newTail=newTail.next;
        }
        head=newTail.next;
        newTail.next=null;
        
        return head;
    }
}