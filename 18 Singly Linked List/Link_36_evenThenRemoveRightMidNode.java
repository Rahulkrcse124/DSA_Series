public class Link_36_evenThenRemoveRightMidNode {

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

        void removeRightNodeOfLinkedList() {
            Node slow = head;
            Node fast = head;
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
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

        // 2nd method through delete the right node of linkedlist
        void deleteRightNode() {
            Node temp = head;
            int n = size() / 2;
            for (int i = 1; i <= n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
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
        // ll.add(70);
        // ll.add(80);

        System.out.println("original LinkedList: ");
        ll.display();

        System.out.println();
        System.out.println("after delete right node of linkedlist");
        ll.removeRightNodeOfLinkedList();
        ll.display();

        // System.out.println();
        // System.out.println("2nd method through delete the right mid");
        // ll.deleteRightNode();
        // ll.display();

    }

}
