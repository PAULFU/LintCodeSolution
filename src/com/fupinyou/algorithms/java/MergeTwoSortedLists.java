/**
 * Created by fupinyou on 2016/5/4.
 */
public class MergeTwoSortedLists {
    private class ListNode {
             int val;
             ListNode next;
             ListNode(int val) {
                     this.val = val;
                     this.next = null;
                 }
         }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) return null;
        if (l1==null) return l2;
        if(l2==null) return l1;
        ListNode index_l1=l1;
        ListNode index_l2=l2;
        ListNode head=new ListNode(0);
        ListNode index=head;
        do {
            if(index_l1.val<index_l2.val){
                index.next=index_l1;
                index=index.next;
                index_l1=index_l1.next;
            }
            else {
                index.next=index_l2;
                index=index.next;
                index_l2=index_l2.next;
            }
        }
        while (index_l1!=null && index_l2!=null);

        if (index_l1!=null){
            while (index_l1!=null){
                index.next=index_l1;
                index=index.next;
                index_l1=index_l1.next;
            }
        }
       if(index_l2!=null){
           while (index_l2!=null){
               index.next=index_l2;
               index=index.next;
               index_l2=index_l2.next;
           }
       }
        return head.next;
    }
}
