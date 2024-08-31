public class Link_25_middleElement {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int size() {
            Node temp = head;
            int length = 0;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            return length;
        }

        int middleNodeOfLinkedList() {
            Node temp = head;
            int n = (size() / 2);
            for (int i = 1; i <= n; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(90);
        ll.add(4);
        ll.add(5);
        ll.add(12);
        ll.add(6);
        ll.add(2);
        System.out.println("original LinkedList:");
        ll.display();
        System.out.println();
        System.out.println("middle node is: " + ll.middleNodeOfLinkedList());

    }

}
