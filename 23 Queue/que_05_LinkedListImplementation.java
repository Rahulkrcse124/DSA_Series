public class que_05_LinkedListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queueA {
        Node head = null;
        Node tail = null;

        public void add(int data) {
            Node value = new Node(data);

            if (head == null) {
                head = tail = value;
            } else {
                tail.next = value;
                tail = tail.next;
            }
        }

        Node remove() {
            head = head.next;
            return head;
        }

        int peek() {
            return head.data;
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
        queueA q = new queueA();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        System.out.println();
        System.out.println("after remove LinkedList");
        q.remove();
        q.display();

        System.out.println();
        System.out.println("peek Element: " + q.peek());

    }

}
