public class st_18_LinkedListImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head = null;

        void push(int x) {
            Node value = new Node(x);
            value.next = head;
            head = value;
            System.out.println(" ");
        }

        int pop() {
            if (head == null) {
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        void peek() {
            if (head == null) {
                return;
            }
            System.out.print(head.data);
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        boolean isEmpty() {
            if (head == null) {
                System.out.println(" Empty");
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();

        st.push(20);
        st.display();

        st.push(30);
        st.display();

        st.push(40);
        st.display();

        System.out.println();
        System.out.println("Diplay Of LinkedList");
        st.display();

        System.out.println();

        System.out.println("peek of LinkedList");
        st.peek();

        System.out.println();

        System.out.print("pop Node is = " + st.pop());
        System.out.println();
        System.out.println("after pop Linkedlist");
        st.display();

        System.out.println();
        System.out.println(st.isEmpty());

    }

}
