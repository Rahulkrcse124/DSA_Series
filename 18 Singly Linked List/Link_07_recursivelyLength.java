public class Link_07_recursivelyLength {

    public static int recursivelyLength(Node head) {
        // base case
        if(head == null) {
            return 0;
        }

        return 1 + recursivelyLength(head.next);
        
    }

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(recursivelyLength(a));
        
    }
    
}
