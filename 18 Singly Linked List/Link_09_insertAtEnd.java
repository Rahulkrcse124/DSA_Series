public class Link_09_insertAtEnd {

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node value = new Node(data);
            if(head ==null) {
                head = value;
                tail = value;
            }
            if(head != null) {
                tail.next = value;
                tail = value;
            }
        }

        int size() {
            int count = 0;
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
        System.out.println();
        System.out.println("size of length: "+ ll.size());
    }
}
