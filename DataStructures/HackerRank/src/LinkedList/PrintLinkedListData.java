package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintLinkedListData {


    public static class SingleLinkedListNode {
        public int data;
        public SingleLinkedListNode next;

        public SingleLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

   public static class SingleLinkedList {
        public SingleLinkedListNode head;
        public SingleLinkedListNode tail;

        public SingleLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SingleLinkedListNode node = new SingleLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    public static void printLinkedList(SingleLinkedListNode head) {
        if (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    //
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        LinkedList<Object> input = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            Object o = scanner.nextLine();
//            input.add(o);
//
//
//        }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SingleLinkedList llist = new SingleLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}


