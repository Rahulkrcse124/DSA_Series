public class dLink_04_insertAtIndex {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void originalDisplay(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node insertAtIndexNode(Node head, int index, int value) {
        Node currHeadNode = head;
        Node temp = currHeadNode;
        int n = index;
        for (int i = 1; i <= n - 1; i++) {
            temp = temp.next;
        }
        Node valueNode = new Node(value);
        valueNode.next = temp.next;
        temp.next.prev = valueNode;
        temp.next = valueNode;
        valueNode.prev = temp;

        return currHeadNode;
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
        originalDisplay(a);

        System.out.println();
        System.out.println("after insert value Linkedlist");
        insertAtIndexNode(a, 3, 200);
        originalDisplay(a);
    }
}
