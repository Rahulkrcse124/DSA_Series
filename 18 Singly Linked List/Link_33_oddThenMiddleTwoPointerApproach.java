public class Link_33_oddThenMiddleTwoPointerApproach {

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

        Node oddThenMiddleNode() {
            Node slow = head;
            Node fast = head;

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
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
        System.out.println("original LinkedList: ");
        ll.display();

        System.out.println();

        Node midNode = ll.oddThenMiddleNode();
        System.out.println(midNode.data);
    }

}
