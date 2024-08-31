public class Link_35_evenThenRemoveLeftMidNode {

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

        // delete left node when linkled is even only one traversal with two pointer
        // approach
        void deleteLeftMidNode() {
            Node slow = head;
            Node fast = head;
            while (fast.next.next.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // after loop break slow on 30 and fast on 50
            // System.out.println("slow data:" + slow.data); 30
            // System.out.println("fast data" + fast.data); 50
            slow.next = slow.next.next;

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
        ll.add(70);
        ll.add(80);

        System.out.println("original LinkedList: ");
        ll.display();

        System.out.println();
        System.out.println("after delete Mid Node");
        ll.deleteLeftMidNode();
        ll.display();

    }

}
