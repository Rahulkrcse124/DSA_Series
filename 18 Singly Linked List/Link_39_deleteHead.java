public class Link_39_deleteHead {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node removeNodeOfLinkedList(Node head) {
        Node temp = head;
        if (temp == null) {
            return null;
        } else {
            temp = temp.next;
        }
        return temp;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
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
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);

        System.out.println();
        System.out.println("after removing linkedList");
        a = removeNodeOfLinkedList(a);
        display(a);

    }

}