public class Link_20_deleteNthNodeFromLast {
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
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void deleteNthNodeFromLast(int n) {
            Node temp = head;
            int lsize = size();
            int m = lsize - n + 1;
            for (int i = 1; i <= m - 1; i++) {
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
        ll.add(70);
        ll.display();
        System.out.println();
        ll.deleteNthNodeFromLast(3);
        ll.display();

    }

}
