package LinkedList;

import java.util.Objects;

public class LinkedList {

    public static void main(String []args) {
        LinkedList seasons = new LinkedList();
        seasons.printList();
        seasons.addToHead("summer");
        seasons.addToHead("spring");
        seasons.printList();
        seasons.addToTail("fall");
        seasons.addToTail("winter");
        seasons.printList();
        seasons.removeHead();
        seasons.printList();
        Node a=new Node("AAA");
        Node b=new Node("BBB");
        Node c=new Node("CCC");
        Node d=new Node("DDD");
        seasons.addToHead(c.data);
        seasons.addToHead(d.data);
        seasons.addToTail(a.data);
        seasons.addToTail(b.data);

        LinkedList myList = new LinkedList();

        myList.addToHead("Node 1");
        myList.addToHead("Node 2");
        myList.addToHead("Node 3");
        myList.addToHead("Node 4");

        // Find Node iteratively:
        Node foundNode = myList.findNodeRecursively("Node 5", myList.head);
        System.out.println(foundNode.data);


    }
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data){
        Node tail=this.head;
        if(tail==null){
            this.head=new Node(data);
        }else{
            while(tail.getNextNode()!=null){
                tail= tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }
    public String removeHead(){
        Node removedHead=this.head;
        if(removedHead==null){
            return null;
        }
        this.head=removedHead.getNextNode();
        return  removedHead.data;
    }
    public String printList(){
        String output="<head> ";
        Node currentNode=this.head;
        while(currentNode != null){
            output+= currentNode.data +" ";
        }
        output+="<tail>";
        return output;
    }
    public Node findNodeRecursively(String data, Node currentNode) {

        if(currentNode==null){
            return null;
        }else if(currentNode.data==data){
            return currentNode;
        }else{
            return  findNodeRecursively(data,currentNode.getNextNode());
        }


    }
}