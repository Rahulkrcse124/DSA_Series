public class Link_01 {

    public static class Node {
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

        // all node connected to each other
        a.next = b; // 10->20 30 40 50 60
        b.next = c; // 10->20->30 40 50 60
        c.next = d; // 10->20->30-> 40 50 60
        d.next = e; // 10->20->30-> 40 ->50 60
        e.next = f; // 10->20->30->40->50->60

        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println(f.data);

        System.out.println("2nd method");

        System.out.println(a.data); // 10
        System.out.println(a.next.data); // 20
        System.out.println(a.next.next.data); // 30
        System.out.println(a.next.next.next.data); // 40
        System.out.println(a.next.next.next.next.data);// 50
        System.out.println(a.next.next.next.next.next.data); // 60

    }
}