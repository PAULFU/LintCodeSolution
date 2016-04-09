/**
 * Created by fupinyou on 2016/4/9.
 * 你有两个用链表代表的整数，其中每个节点包含一个数字。
 * 数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。
 * 写出一个函数将两个整数相加，用链表形式返回和。
 * 给出两个链表 3->1->5->null 和 5->9->2->null，返回 8->0->8->null
 */
public class AddTwoNumbers {
    public static class LinkedNode {
            int val;
        LinkedNode next;
        LinkedNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public static LinkedNode addlist(LinkedNode l1,LinkedNode l2){
        if(l1 == null && l2 == null) {
            return null;
        }

        LinkedNode head = new LinkedNode(0);
        LinkedNode point = head;
        int carry = 0;
        while(l1 != null && l2!=null){
            int sum = carry + l1.val + l2.val;
            point.next = new LinkedNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }

        while(l1 != null) {
            int sum =  carry + l1.val;
            point.next = new LinkedNode(sum % 10);
            carry = sum /10;
            l1 = l1.next;
            point = point.next;
        }

        while(l2 != null) {
            int sum =  carry + l2.val;
            point.next = new LinkedNode(sum % 10);
            carry = sum /10;
            l2 = l2.next;
            point = point.next;
        }

        if (carry != 0) {
            point.next = new LinkedNode(carry);
        }
        return head.next;
    }
    public static void main(String[] args){
        LinkedNode l1=new LinkedNode(2);
        LinkedNode l2=new LinkedNode(9);
        LinkedNode l3=new LinkedNode(5);
        l2.next=l1;
        l3.next=l2;
        LinkedNode l4=new LinkedNode(5);
        LinkedNode l5=new LinkedNode(1);
        LinkedNode l6=new LinkedNode(3);
        l5.next=l4;
        l6.next=l5;
        LinkedNode rst=addlist(l3,l6);
        while (rst!=null){
            System.out.println(rst.val);
            rst=rst.next;
        }
    }
}
