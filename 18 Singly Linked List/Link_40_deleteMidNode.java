public class Link_40_deleteMidNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void deleteMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.data); 4
        // System.out.println(fast.data); 1
        slow.next = slow.next.next;
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
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println("original");

        display(a);

        System.out.println();
        System.out.println();
        deleteMidNode(a);
        display(a);
    }
}
