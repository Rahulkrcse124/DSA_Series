public class Link_37_EremoveLastNode {

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

        void removeLastElement() {
            Node temp = head;
            while (temp.next.next != null) {
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

        System.out.println("original LinkedList: ");
        ll.display();

        System.out.println();
        System.out.println("after delete the last Node");
        ll.removeLastElement();
        ll.display();

    }
}
