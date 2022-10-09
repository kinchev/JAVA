package DoublyLinkedList;

import java.util.ArrayList;
public class nLastNode {

  public static void main(String []args) {
    // Use this to test your code:  
    LinkedList ll = createList();
    ll.printList();
    Node n = nthLastNode(ll, 9);
    System.out.print(n.data);
  }

  public static Node nthLastNode(LinkedList list, int n) {
    
    return null;
  }

  public static LinkedList createList() {
    LinkedList list = new LinkedList();
    for (int i = 50; i >= 1; i--) {
      list.addToTail(i);
    }
    return list;
  }

}