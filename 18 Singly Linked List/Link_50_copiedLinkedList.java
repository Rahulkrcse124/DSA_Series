public class Link_50_copiedLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node copiedLinkedList(Node head) {
            Node temp = head;
            Node dummyNode = new Node(0);
            Node dn = dummyNode;

            while (temp != null) {
                Node value = new Node(temp.data);
                dn.next = value;
                dn = dn.next;

                temp = temp.next;
            }
            return dummyNode.next;
        }

        void copiedLiskedListDisplay(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static class allLinkedList {

        Node allInOneOriginalAndCopied(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;
            Node dummyNode = new Node(0);
            Node t = dummyNode;

            while (temp1 != null && temp2 != null) {
                t.next = temp1;
                temp1 = temp1.next;
                t = t.next;

                t.next = temp2;
                temp2 = temp2.next;
                t = t.next;
            }
            return dummyNode.next;
        }

        void displayAllInOne(Node head) {
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
        System.out.println("copied LinkedList");
        LinkedList ll = new LinkedList();
        Node copyHeadNode = ll.copiedLinkedList(a);
        ll.copiedLiskedListDisplay(copyHeadNode);

        System.out.println();
        System.out.println("all LinkedList in one");
        allLinkedList ll2 = new allLinkedList();
        Node allInOneHeadNode = ll2.allInOneOriginalAndCopied(a, copyHeadNode);
        ll2.displayAllInOne(allInOneHeadNode);
    }
}
