package LinkedList;

public class DesignLinkedList {
    public class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val=val;
        }
    }
    public Node head;
    public int size;

    public DesignLinkedList() {
        head=new Node(0);
    }
    
    public int get(int index) {
        if(index >=size || index <0){
            return -1;
        }
        int count=0;
        Node curr=head;
        while(curr !=null){
            if(size==index){
                return curr.val;
            }
            count++;
            curr=curr.next;

        }
        return -1;
    }
    
    public void addAtHead(int val) {
        if(head==null){
            return;
        }
        
        
    }
    
    public void addAtTail(int val) {
        
    }
    
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }
}
}
