public class Link_44_oneLLDivideInotOddAndEvenLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class eLinkedList {
        Node evenLinkedList(Node head) {
            Node temp = head;
            Node evenHead = new Node(99);
            Node temp1 = evenHead;
            while (temp != null) {
                if (temp.data % 2 == 0) {
                    Node evenNodeValue = new Node(temp.data);
                    temp1.next = evenNodeValue;
                    temp1 = evenNodeValue;
                }
                temp = temp.next;
            }
            return evenHead.next;
        }

        void Evendisplay(Node evenHead) {
            Node temp = evenHead;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static class oLinkedList {
        Node oddLinkedList(Node head) {
            Node temp = head;
            Node even = new Node(100);
            Node temp2 = even;
            while (temp != null) {
                if (temp.data % 2 != 0) {
                    Node oddValue = new Node(temp.data);
                    temp2.next = oddValue;
                    temp2 = oddValue;
                }
                temp = temp.next;
            }
            return even.next;
        }

        void oddDisplay(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
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
        eLinkedList ll = new eLinkedList();
        System.out.println("even linkedList");
        Node ans = ll.evenLinkedList(a);
        ll.Evendisplay(ans);

        System.out.println();
        System.out.println("odd LinkedList is ");
        oLinkedList ll2 = new oLinkedList();
        Node odd = ll2.oddLinkedList(a);
        ll2.oddDisplay(odd);
    }
}
