public class dLink_07_deleteAtIndexNode {

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
        Node delteAtIndexNode(Node head, int index) {
            Node currNode = head;
            Node temp = currNode;
            int n = index;
            for (int i = 1; i <= n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return currNode;
        }

        void displayAfterRemoveIndexNode(Node head) {
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
        LinkedList ll = new LinkedList();
        Node headNode = ll.delteAtIndexNode(a, 3);
        ll.displayAfterRemoveIndexNode(headNode);

    }

}
