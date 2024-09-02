public class doubly_circular_02_deleteHeadNode {

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

    public static class LinkedList {
        Node removeHeadNode(Node head) {
            Node currNode = head;
            Node temp = head;
            temp = temp.next;
            while (temp.next != currNode) {
                temp = temp.next;
            }
            currNode = currNode.next;
            currNode.prev = temp;
            temp.next = currNode;

            return currNode;
        }

        void displayAfterRemoveHead(Node head) {
            Node currNode = head;
            Node temp = head;

            System.out.print(temp.data + " ");
            temp = temp.next;
            while (temp != currNode) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node tail = new Node(50);

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
        System.out.println("after remove head LinkedList is: ");
        LinkedList ll = new LinkedList();

        Node nodeAfterRemove = ll.removeHeadNode(head);
        ll.displayAfterRemoveHead(nodeAfterRemove);
    }
}
