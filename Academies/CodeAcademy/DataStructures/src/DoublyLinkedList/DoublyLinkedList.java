package DoublyLinkedList;

import java.util.Objects;

public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;
        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;
        if (head == null) {
        }
        this.head = newTail;

    }

    public void removeHead() {
        Node removedHead = this.head;

        if (removedHead == null) {
            return;
        }
        this.head = removedHead.getNextNode();

        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
    }

    public String printList() {
        Node currentNode = this.head;
        StringBuilder output = new StringBuilder("<head> ");
        while (currentNode != null) {
            output.append(currentNode.data).append(" ");
            currentNode = currentNode.getNextNode();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }

    public String removeTail() {
        Node removedTail = this.tail;
        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data;
    }

    public Node removeByData(String data) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }

        if (nodeToRemove == null) {
            return null;
        }
        if (nodeToRemove == this.head) {
            this.removeHead();
        } else if (nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            Node nextNode = nodeToRemove.getNextNode();
            Node previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
        }
        return nodeToRemove;
    }

    public static void main(String[] args) {
        DoublyLinkedList subway = new DoublyLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.printList();
        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.printList();
        subway.removeHead();
        subway.removeTail();

        subway.printList();
        subway.removeByData("Times Square");

    }

}