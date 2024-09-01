public class dLink_02_randomNodeThenPrintAll {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayThroughRandomNode(Node randomNode) {
        Node temp = randomNode;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        Node temp2 = temp;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
    }

    public static void displayReverseByRandomNode(Node randomNode) {
        Node temp = randomNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node temp2 = temp;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.prev;
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

        System.out.println("original LinkedList");
        displayThroughRandomNode(c); // here we can give the random node

        System.out.println();
        System.out.println("reverse LinkedList");
        displayReverseByRandomNode(c);
    }
}
