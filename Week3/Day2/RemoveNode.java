public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
        int k=0;
        while(temp!=null){
            temp=temp.next;
             k++;
        }
       
         if(n==k){
            head=head.next;
            return head;
        }
        ListNode t=head;
        int i=1;
        while(i<(k-n)){
            t=t.next;
            i++;
        }
        t.next=t.next.next;
        return head;
    }
    
}
