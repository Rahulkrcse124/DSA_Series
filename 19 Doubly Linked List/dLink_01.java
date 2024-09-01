public class dLink_01 {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayReverse(Node tail) {
        Node tailNode = tail;
        while (tailNode != null) {
            System.out.print(tailNode.data + " ");
            tailNode = tailNode.prev;
        }
    }

    public static void main(String args[]) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.prev = null;

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = null;

        System.out.println("original LinkedList");
        display(a);

        System.out.println();
        System.out.println("reverse LinkedList");
        displayReverse(e);
    }
}