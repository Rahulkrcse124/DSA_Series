public class Link_02_display {

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

        // Node temp = a;
        // for(int i=1; i<=6; i++) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        Node temp = a;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }   
    }  
}
