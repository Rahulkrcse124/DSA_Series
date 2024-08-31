public class Link_42_mergeTwoSortedLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        public static Node mergeTwoLinkedList(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;
            Node head = new Node(100); // Dummy node
            Node temp = head;

            while (temp1 != null && temp2 != null) {
                if (temp1.data < temp2.data) {
                    temp.next = new Node(head1.data);
                    temp1 = temp1.next;
                    temp = temp.next;
                } else {
                    temp.next = new Node(temp2.data);
                    temp2 = temp2.next;
                    temp = temp.next;
                }

            }

            if (temp1 != null) {
                temp.next = temp1;
            } else {
                temp.next = temp2;
            }

            return head.next; // Return the head of the merged list, skipping the dummy
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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

        Node a1 = new Node(2);
        Node b1 = new Node(4);
        Node c1 = new Node(6);
        Node d1 = new Node(7);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;

        LinkedList.display(a);
        LinkedList.display(a1);

        Node mergedHead = LinkedList.mergeTwoLinkedList(a, a1);
        LinkedList.display(mergedHead); // Display the merged list
    }
}
