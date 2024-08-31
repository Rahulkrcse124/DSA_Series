public class Link_14_insertNodeAtEnd {

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void insertNodeAtEnd(Node head ,int data) {
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next!= null ) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        // newNode.next = null; optional
        temp.next = newNode;
    }

   
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {   
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("original linkedlist");
        display(a);

        System.out.println("after node insert At end");
        insertNodeAtEnd(a, 100);
        display(a); 
    }
}
