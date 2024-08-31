public class Link_21_deleteNthNodeFromLastTwoPointerApproach {

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
            } else {
                tail.next = value;
            }
            tail = value;
        }

        void deleteNthNodeFromLast(int n) {
            // Node temp = head;
            Node slow = head;
            Node fast = head;

            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }

        // Node remomeNthNodeFromLast(int n) {
        // Node slow = head;
        // Node fast = head;

        // for (int i = 1; i <= n; i++) {
        // fast = fast.next;
        // }
        // while (fast.next != null) {
        // slow = slow.next;
        // fast = fast.next;
        // }
        // return slow;
        // }

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
        ll.display();
        System.out.println();

        ll.deleteNthNodeFromLast(3);
        ll.display();

        // System.out.println();
        // Node ans = ll.remomeNthNodeFromLast(2);
        // System.out.println("deleted Node is: "+ans.next.data);

    }

}
