public class doubly_circular_04_CheckPalindrom {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void originalDisplay(Node head) {
        Node currNode = head;
        Node temp = currNode;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while (temp != currNode) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static boolean palindrom(Node head) {
        Node temp1 = head;
        Node temp2 = head;

        while (temp2.next != temp1) {
            temp2 = temp2.next;
        }
        Node tailNode = temp2;
        Node headNode = temp1;

        while (temp1 != tailNode && temp2 != headNode) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(20);
        Node tail = new Node(10);

        head.prev = tail;
        head.next = b;
        b.prev = head;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = tail;
        tail.prev = d;

        tail.next = head;

        System.out.println("original Display");
        originalDisplay(head);

        System.out.println();
        System.out.println("this linkedList is: ");
        System.out.println(palindrom(head));
    }
}
