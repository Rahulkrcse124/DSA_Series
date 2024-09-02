public class singly_circular_01 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayCircularLinkedList(Node head) {
        Node currNode = head;
        System.out.print(currNode.data + " ");
        Node temp = currNode.next;
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        displayCircularLinkedList(a);

    }
}