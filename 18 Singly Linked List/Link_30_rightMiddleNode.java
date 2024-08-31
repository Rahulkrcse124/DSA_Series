public class Link_30_rightMiddleNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node value = new Node(data);
            if (head == null) {
                head = value;
                tail = value;
            } else {
                tail.next = value;
                tail = value;
            }
        }

        int size() {
            Node temp = head;
            int length = 0;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            return length;
        }

        Node rightMiddleNodeOfLinkedList() {
            Node temp = head;
            int n = size() / 2;

            for (int i = 1; i <= n; i++) {
                temp = temp.next;
            }
            return temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println("original LinkedList");
        ll.display();

        System.out.println();
        Node middleNode = ll.rightMiddleNodeOfLinkedList();
        System.out.println("middle Left Node is: " + middleNode.data);

    }

}
