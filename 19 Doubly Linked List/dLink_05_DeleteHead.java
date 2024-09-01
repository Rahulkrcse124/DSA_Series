public class dLink_05_DeleteHead {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node deleteHeadNode(Node head) {
            Node temp = head;
            temp = temp.next;
            temp.prev = null;
            return temp;
        }

        void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
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
        ll.display(a);

        System.out.println();
        System.out.println("after delete head Linked list");
        Node currHead = ll.deleteHeadNode(a);
        ll.display(currHead);

    }

}
