import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateFromLinkedList {


    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }


    }

    public LinkedList removeDuplicateFromLinkedList(LinkedList linkedList) {
        LinkedList current = linkedList;
        while (current != null) {
            LinkedList nextNode = current.next;
            while (nextNode != null && nextNode.value == current.value) {
                nextNode = nextNode.next;
            }
            current.next = nextNode;
            current = nextNode;

        }
        return linkedList;
    }

}
