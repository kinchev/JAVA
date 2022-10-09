package DoublyLinkedList;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead=new Node(data);
        Node currentHead=this.head;
        if(head==null){
            this.head = newHead;
        }
    }

    public void printList() {
    }
}
