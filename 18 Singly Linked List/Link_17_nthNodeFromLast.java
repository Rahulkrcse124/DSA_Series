public class Link_17_nthNodeFromLast{

    public static class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void add(int value) {
            Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
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

        int nthNodeFromLast(int n) {
            Node temp = head;
            int m = size()-n+1;
            for(int i=1; i<=m-1; i++) {
                temp = temp.next;
            }
            return temp.value;

        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value+" ");
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
        System.out.println("original LinkedList");
        ll.display();

        System.out.println();
        System.out.println(ll.nthNodeFromLast(7));

        
    }
}