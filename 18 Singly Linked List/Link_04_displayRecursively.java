public class Link_04_displayRecursively {

    public static void displayRecursive(Node head) {

        // base case
        if(head==null) {
            return;
        }

        // self work
        System.out.print(head.data+" ");

        // recursive work
        displayRecursive(head.next);

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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayRecursive(a);
        
    }
    
}
