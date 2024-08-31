public class Link_08_implementation {

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int value) {
            Node temp = new Node(value);

            if(head ==null) {
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }

        }

        
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);

        ll.display();
        
    }
    
}
