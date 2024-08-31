public class Link_11_insertAtIndex {

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

        void insertAtHead(int data) {
            Node value = new Node(data);
            if(head ==null) {
                head = value;
                tail = value;
            }
            else{
                value.next = head;
                head = value;
            }
        }
        void add(int data) {
            Node value = new Node(data);

            if(head == null) {
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }

        int size() {
            Node temp = head;
            int size = 0;
            while(temp != null) {
                size++;
                temp = temp.next;
            }
            return size;
        }


        void insertAtIndex(int index, int data) {
            Node newValue = new Node(data);
            Node temp = head;

            if(index == 0) {
                insertAtHead(data);
                return;
            }
            else if(index<0 || index>size()) {
                return;
            }

            for(int i=1; i<=(index-1); i++ ) {
                temp = temp.next;
            }
            newValue.next = temp.next;
            temp.next = newValue;
            
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
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
        System.out.println(" original linkedList is: ");
        ll.display();

        System.out.println();
        System.out.println(" after likedlist value insert at index");
        ll.insertAtIndex(3,100);
        ll.display();
        System.out.println(" ");

        ll.insertAtIndex(0,200);
        ll.display();
    }
}
