public class Link_10_insertAtFirst {

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

        void insertAtFirst(int data) {
            Node newNode = new Node(data);

            if(head==null && tail==null) {
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(10);
        ll.insertAtFirst(20);
        ll.insertAtFirst(30);

        ll.display();
        System.out.println(" ");
        ll.size();
    }
}
