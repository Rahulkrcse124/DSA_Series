public class Link_45_firstOddThenEvenLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node firstOddThenEven(Node head) {
        Node temp = head;

        Node ovalue = new Node(99);
        Node tempO = ovalue;

        Node evalue = new Node(100);
        Node tempE = evalue;
        while (temp != null) {

            if (temp.data % 2 != 0) {
                Node ovalueN = new Node(temp.data);
                tempO.next = ovalueN;
                tempO = ovalueN;
            } else {
                Node evalueN = new Node(temp.data);
                tempE.next = evalueN;
                tempE = evalueN;
            }
            temp = temp.next;
        }
        tempO.next = evalue.next;
        return ovalue.next;
    }

    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println("original LinkedList");
        Display(a);

        System.out.println();
        System.out.println("LinkedList in form of line first All odd then even ");
        Node ans = firstOddThenEven(a);
        Display(ans);
    }
}
