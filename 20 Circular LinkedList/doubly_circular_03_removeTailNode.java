public class doubly_circular_03_removeTailNode {

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
        Node removeTailNode(Node head) {
            Node temp = head;
            Node currNode = head;
            while (temp.next.next != currNode) {
                temp = temp.next;
            }
            currNode.prev = temp;
            temp.next = currNode;
            return currNode;
        }

        void displayLLAfterRemoveTail(Node head) {
            Node currNode = head;
            Node temp = head;
            System.out.print(temp.data + " ");
            temp = temp.next;
            while (temp != currNode) {
                System.out.println(temp.data + " ");
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
        System.out.println("linkedList after delete the Tail Node");
        LinkedList ll = new LinkedList();
        Node headNode = ll.removeTailNode(head);
        ll.displayLLAfterRemoveTail(headNode);
    }
}
