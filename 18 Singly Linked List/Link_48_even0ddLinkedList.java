public class Link_48_even0ddLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node oddEvenLinkedList(Node head) {
            Node odd = new Node(0);
            Node even = new Node(0);
            Node tempo = odd;
            Node tempe = even;
            Node temp = head;

            while (temp != null) {
                tempo.next = temp;
                temp = temp.next;
                tempo = tempo.next;

                tempe.next = temp;
                if (temp == null)
                    break;
                temp = temp.next;
                tempe = tempe.next;
            }
            odd = odd.next;
            even = even.next;
            tempo.next = even;

            return odd;
        }

        void oddEvenDisplay(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void originalDisplay(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("original LinkedList");
        originalDisplay(a);

        System.out.println();
        System.out.println("odd Even Linkedlist");
        LinkedList ll = new LinkedList();
        Node oddEven = ll.oddEvenLinkedList(a);
        ll.oddEvenDisplay(oddEven);
    }
}