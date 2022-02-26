package HashMap;

public class NodeHash {
    public String key;
    public String value;
    public NodeHash next;

    public NodeHash(String key, String value) {
        this.key  = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNode(NodeHash node) {
        this.next = node;
    }

    public NodeHash getNextNode() {
        return this.next;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
