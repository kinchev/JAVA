package LinkedList;

import java.util.HashSet;
import java.util.Set;

import LinkedList.MiddleofTheLinkedList876.ListNode;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        Set s=new HashSet();
        while(head!=null){
        
        if(s.contains(head)){
        return true;
    }
        s.add(head);
        head=head.next;
        }
        return false;
    }
        public static void main(String[] args) {
            
        }
}
