public class dLink_03_insertAtHead{
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

    public static void insertAtHead(Node head, int newValue) {
        Node temp = head;
        Node newNode = new Node(newValue);
        Node t = newNode;

        t.next = temp;
        temp.prev = t;
        temp = temp.prev;
        t = t.next;

        Node currHead = temp;

        while (currHead != null) {
            System.out.print(currHead.data + " ");
            currHead = currHead.next;
        }
    }

    public static void insertAtTail(Node head, int value) {
        Node currHeadNode = head;
        Node temp = currHeadNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node tailNode = temp;
        Node newNode = new Node(value);
        tailNode.next = newNode;
        newNode.prev = tailNode;
        tailNode = tailNode.next;

        while (currHeadNode != null) {
            System.out.print(currHeadNode.data + " ");
            currHeadNode = currHeadNode.next;
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

        System.out.println("original linkedList");
        originalDisplay(a);

        System.out.println();
        System.out.println("after Insertion value on head");
        insertAtHead(a, 100);

        System.out.println();
        System.out.println("after insert value at tail");
        insertAtTail(a, 200);

    }

}
