/**
 * Created by fupinyou on 2016/4/17.
 */
public class DeleteNode {
    private class ListNode {
             int val;
             ListNode next;
             ListNode(int val) {
                    this.val = val;
                    this.next = null;
                }
         }
    public static void deleteNode(ListNode node){
        if (node==null) return;
        if (node.next==null){
            node=null;
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
