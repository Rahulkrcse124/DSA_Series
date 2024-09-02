public class doubly_circular_01 {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayCircularDoublyLinkedList(Node head) {
        Node currNode = head;
        Node temp = head;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while (temp != currNode) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.prev = e;
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = a;

        displayCircularDoublyLinkedList(a);

    }
}
