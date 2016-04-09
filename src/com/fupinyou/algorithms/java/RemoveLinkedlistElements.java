/**
 * Created by fupinyou on 2016/4/8.
 * 删除链表中等于给定值val的所有节点。
 */
public class RemoveLinkedlistElements {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode  removeLinkedlistElements(ListNode head,int val){
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        while (head.next!=null){
            if(head.next.val==val){
                head.next=head.next.next;
            }
            else {
                head=head.next;
            }
        }
        return head;
    }
    public static void main(String[] args){

    }
}
