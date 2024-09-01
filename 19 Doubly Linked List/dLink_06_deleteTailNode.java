public class dLink_06_deleteTailNode {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void originalLinkedListDisplay(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static class LinkedList {
        Node deleteTailNode(Node head) {
            Node currNode = head;
            Node temp = currNode;

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next.prev = temp;
            temp.next = null;
            return currNode;
        }

        void displayAfterRemoveLL(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.prev = null;

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = f;
        f.prev = e;

        f.next = null;
        System.out.println("original Linked list");
        originalLinkedListDisplay(a);

        System.out.println();
        System.out.println("after remove the tail node");
        LinkedList ll = new LinkedList();
        Node headNode = ll.deleteTailNode(a);
        ll.displayAfterRemoveLL(headNode);
    }
}
