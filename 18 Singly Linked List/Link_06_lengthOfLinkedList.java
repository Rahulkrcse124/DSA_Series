public class Link_06_lengthOfLinkedList {

    public static int lengthOfLinkedList(Node head) {
        int countLength = 0;
        while(head != null) {
            countLength++;
            head = head.next;
        }
        return countLength;
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

        System.out.println("length of linkedList : " + lengthOfLinkedList(a)); 
    }
}