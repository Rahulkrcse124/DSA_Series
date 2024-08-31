public class Link_47_reverseLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node reverseLinkedList(Node head) {
            Node dummyNode = new Node(0); // Use 0 or any dummy value as placeholder
            dummyNode.next = null;
            Node dn = dummyNode;
            Node temp = head;

            while (temp != null) {
                Node value = new Node(temp.data);
                value.next = dn.next; // Point value.next to the previous head
                dn.next = value; // Update dummyNode.next to point to the new node
                temp = temp.next;
            }
            return dummyNode.next; // Return the new head
        }

        void reversedDisplay(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void originalLinkedListDisplay(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original LinkedList:");
        originalLinkedListDisplay(a);

        System.out.println("Reversed LinkedList:");
        LinkedList ll = new LinkedList();
        Node ans = ll.reverseLinkedList(a);
        ll.reversedDisplay(ans);
    }
}

// public class Link_47_reverseLinkedList {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// }
// }

// public static class LinkedList {

// Node reverseLinkedList(Node head) {
// Node dummyNode = new Node(100);
// dummyNode.next = null;
// Node dn = dummyNode;
// Node temp = head;

// while (temp != null) {
// Node value = new Node(temp.data);
// // value.next = dn;
// // value = dn;
// // temp = temp.next;
// value.next = dn.next; // Point value.next to the previous head
// dn.next = value; // Update dummyNode.next to point to the new node
// temp = temp.next;
// }
// return temp;
// }

// void revrsedDisplay(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }
// }

// public static void originalLinkedListDisplay(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void main(String[] args) {
// Node a = new Node(1);
// Node b = new Node(2);
// Node c = new Node(3);
// Node d = new Node(4);
// Node e = new Node(5);
// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;

// System.out.println("orginal LinkedList");
// originalLinkedListDisplay(a);

// System.out.println();
// System.out.println("revrsed LinkedList");

// LinkedList ll = new LinkedList();
// Node ans = ll.reverseLinkedList(a);
// ll.revrsedDisplay(ans);

// }
// }

// public class Link_47_reverseLinkedList {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// }
// }

// public static class LinkedList {

// Node reverseLinkedList(Node head) {
// Node prev = null;
// Node current = head;
// Node next = null;

// while (current != null) {
// next = current.next; // Store next node
// current.next = prev; // Reverse current node's pointer
// prev = current; // Move pointers one position ahead
// current = next;
// }
// return prev;
// }

// void revrseDisplayLinkedList(Node head) {
// Node temp = head;
// while (temp != null) { // Print until temp becomes null
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }
// }

// public static void originalLinkedListDisplay(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void main(String[] args) {
// Node a = new Node(1);
// Node b = new Node(2);
// Node c = new Node(3);
// Node d = new Node(4);
// Node e = new Node(5);
// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;

// System.out.println("Original LinkedList");
// originalLinkedListDisplay(a);

// System.out.println();
// System.out.println("After reverse LinkedList");
// LinkedList ll = new LinkedList();
// Node reverseNode = ll.reverseLinkedList(a);
// ll.revrseDisplayLinkedList(reverseNode);
// }
// }
