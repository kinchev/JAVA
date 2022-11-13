package LinkedList;

public  class MiddleofTheLinkedList876 {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=head){
                slow=slow.next;
                fast=slow.next.next;

            }
            return slow;

        }
        
    
     public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {


    }
}
