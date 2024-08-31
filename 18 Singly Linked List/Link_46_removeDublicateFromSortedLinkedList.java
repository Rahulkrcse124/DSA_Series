public class Link_46_removeDublicateFromSortedLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node removeDublicateFromSortedLL(Node head) {
        Node temp = head;
        Node dummyNode = new Node(100);
        Node dn = dummyNode;

        while (temp != null) {
            if (temp.data != dn.data) {
                Node value = new Node(temp.data);
                dn.next = value;
                dn = value;
            } else {
                temp = temp.next;
            }
        }
        return dummyNode.next;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(3);
        Node h = new Node(4);
        Node i = new Node(5);
        Node j = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println("original LinkedList");
        display(a);

        System.out.println();
        System.out.println("after Remove dublicate Linked List");
        Node SorteHead = removeDublicateFromSortedLL(a);
        display(SorteHead);

    }
}