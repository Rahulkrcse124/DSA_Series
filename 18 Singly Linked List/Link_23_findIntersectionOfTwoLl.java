public class Link_23_findIntersectionOfTwoLl {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class firstLinkedListClass {
        Node head1 = null;
        Node tail1 = null;

        void firstLinkedList(int data) {
            Node value = new Node(data);
            if (head1 == null) {
                head1 = value;
                tail1 = value;
            } else {
                tail1.next = value;
                tail1 = value;
            }
        }

        int firstSize() {
            Node temp = head1;
            int firstCount = 0;
            while (temp != null) {
                firstCount++;
                temp = temp.next;
            }
            return firstCount;
        }

        void display() {
            Node temp = head1;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static class secondtLinkedListClass {
        Node head2 = null;
        Node tail2 = null;

        void secondLinkedList(int data) {
            Node value = new Node(data);
            if (head2 == null) {
                head2 = value;
                tail2 = value;
            } else {
                tail2.next = value;
                tail2 = value;
            }
        }

        int secondSize() {
            Node temp = head2;
            int secondCount = 0;
            while (temp != null) {
                secondCount++;
                temp = temp.next;
            }
            return secondCount;
        }

        void display() {
            Node temp = head2;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        firstLinkedListClass ll = new firstLinkedListClass();
        ll.firstLinkedList(100);
        ll.firstLinkedList(13);
        ll.firstLinkedList(4);
        ll.firstLinkedList(5);
        ll.firstLinkedList(12);
        ll.firstLinkedList(10);
        ll.display();
        System.out.println("2nd linkedList");

        secondtLinkedListClass ll2 = new secondtLinkedListClass();
        ll2.secondLinkedList(90);
        ll2.secondLinkedList(9);
        ll2.secondLinkedList(5);
        ll2.secondLinkedList(12);
        ll2.secondLinkedList(10);
        ll2.display();
    }
}