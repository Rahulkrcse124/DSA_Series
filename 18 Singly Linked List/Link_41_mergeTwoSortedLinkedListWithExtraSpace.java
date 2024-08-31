public class Link_41_mergeTwoSortedLinkedListWithExtraSpace {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        public static void mergerTwoLinkedList(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;
            Node head = new Node(100);
            Node temp = head;

            while (temp1 != null && temp2 != null) {
                if (temp1.data < temp2.data) {
                    Node temp3 = new Node(temp1.data);
                    temp.next = temp3;
                    temp = temp3;
                    temp1 = temp1.next;
                } else {
                    Node temp3 = new Node(temp2.data);
                    temp.next = temp3;
                    temp = temp.next;
                    temp2 = temp2.next;
                }
            }
            if (temp1 == null) {
                temp.next = temp2;
            } else {
                temp.next = temp1;
            }

            display(head.next);
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        LinkedList.display(a);

        System.out.println();
        System.out.println();
        Node a1 = new Node(2);
        Node b1 = new Node(4);
        Node c1 = new Node(6);
        Node d1 = new Node(7);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        LinkedList.display(a1);

        System.out.println();
        System.out.println();
        LinkedList.mergerTwoLinkedList(a, a1);
    }
}
