package HashMap;

public class LinkedListHash {
    public NodeHash head;

    public LinkedListHash() {
        this.head = null;
    }

    public void addToHead(String key, String value) {
        NodeHash newHead = new NodeHash(key, value);
        NodeHash currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        NodeHash tail = this.head;
        if (tail == null) {
            this.head = new NodeHash(key, value);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new NodeHash(key, value));
        }
    }

    public void removeHead() {
        NodeHash removedHead = this.head;
        if (removedHead == null) {
            return;
        }
        this.head = removedHead.getNextNode();
    }
}