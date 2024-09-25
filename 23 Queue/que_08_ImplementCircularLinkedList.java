public class que_08_ImplementCircularLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularLink {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node value = new Node(data);
            if (head == null) {
                head = tail = value;
            } else {
                tail.next = value;
                tail = value;
                tail.next = head;
            }
        }

        void remove() {
            head = head.next;
            tail.next = head;
        }

        int peek() {
            return head.data;
        }

        void display() {
            Node temp = head;
            temp = temp.next;
            Node currHead = head;
            System.out.print(currHead.data + " ");
            while (temp != currHead) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        CircularLink q = new CircularLink();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();

        System.out.println();
        System.out.println("After remove linkedlist");
        q.remove();
        q.display();

        System.out.println();
        System.out.println("peek element of LinkedList");
        System.out.println(q.peek());

    }

}
