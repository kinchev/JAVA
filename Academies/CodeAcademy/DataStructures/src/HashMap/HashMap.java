package HashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class HashMap {


    public LinkedListHash[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedListHash[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedListHash();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedListHash list = this.hashmap[arrayIndex];
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }
        NodeHash current = list.head;
        while(current != null) {
            if(Objects.equals(current.key, key)) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNode() == null) {
                current.setNextNode(new NodeHash(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }
    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        NodeHash current = this.hashmap[arrayIndex].head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.getNextNode();
        }
        return null;
    }


    public static void main(String[] args) {
        HashMap myHashMap = new HashMap(3);
        System.out.println(myHashMap.hash("car"));
        System.out.println(myHashMap.hash("car"));
        HashMap employees = new HashMap(3);
        employees.assign("34-567", "Mara");
        System.out.println(Arrays.toString(employees.hashmap));
        HashMap aboutMe = new HashMap(3);
        aboutMe.assign("myFavoriteColor", "brown");

    }
}
