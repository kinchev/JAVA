package LinkedList;

public class IntersectionOfTwoLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;

        }
        ListNode aPointer=headA;
        ListNode bPointer=headB;

        while(aPointer!=bPointer){
            if(aPointer==null){
                aPointer=headB;
            }else{
                aPointer=aPointer.next;
            }
            if(bPointer==null){
                bPointer=headA;
            }else{
                bPointer=bPointer.next;
            }
        }
        return aPointer;
    }



public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 public static void main(String[] args) {
    ListNode a=new ListNode(1);
    ListNode b=new ListNode(2);
    ListNode c=new ListNode(3);
    ListNode d=new ListNode(4);
    ListNode e=new ListNode(5);

    ListNode head=a;
    head.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;

    System.out.println(getIntersectionNode(d, e));
 }

}
