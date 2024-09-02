// public class doubly_circular_05_SortedTwoSumTarget {

//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static void originalDisplay(Node head) {
//         Node currNode = head;
//         Node temp = currNode;
//         System.out.print(temp.data + " ");
//         temp = temp.next;
//         while (temp != currNode) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }

//     public static void twoSumTargetNode(Node head, int target) {
//         Node temp1 = head;
//         Node targetNode = new Node(target);
//         Node temp2 = head.next;
//         while (temp2.next != temp1) {
//             temp2 = temp2.next;
//         }

//         Node heaNode = temp1;
//         Node tailNode = temp2;

//         while (heaNode != tailNode) {
//             if (heaNode.data + tailNode.data == targetNode) {
//                 System.out.println(heaNode.data);
//                 System.out.println(tailNode.data);
//                 break;
//             } else if (heaNode.data + tailNode.data > targetNode) {
//                 tailNode = tailNode.prev;
//             } else {
//                 heaNode = heaNode.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Node head = new Node(3);
//         Node b = new Node(5);
//         Node c = new Node(8);
//         Node d = new Node(13);
//         Node tail = new Node(100);

//         head.prev = tail;
//         head.next = b;
//         b.prev = head;

//         b.next = c;
//         c.prev = b;

//         c.next = d;
//         d.prev = c;

//         d.next = tail;
//         tail.prev = d;

//         tail.next = head;

//         System.out.println("original Display");
//         originalDisplay(head);

//         System.out.println();
//         twoSumTargetNode(head, 18);
//     }
// }

public class doubly_circular_05_SortedTwoSumTarget {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void originalDisplay(Node head) {
        Node currNode = head;
        Node temp = currNode;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while (temp != currNode) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void twoSumTargetNode(Node head, int target) {
        Node temp1 = head;
        Node temp2 = head;

        // Find the tail node
        while (temp2.next != head) {
            temp2 = temp2.next;
        }

        Node heaNode = temp1;
        Node tailNode = temp2;

        boolean found = false;
        while (heaNode != tailNode && tailNode.next != heaNode) {
            int sum = heaNode.data + tailNode.data;
            if (sum == target) {
                System.out.println("Pair found: " + heaNode.data + ", " + tailNode.data);
                found = true;
                break;
            } else if (sum > target) {
                tailNode = tailNode.prev;
            } else {
                heaNode = heaNode.next;
            }
        }

        if (!found) {
            System.out.println("No pair found with the given target sum.");
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node tail = new Node(100);

        head.prev = tail;
        head.next = b;
        b.prev = head;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = tail;
        tail.prev = d;

        tail.next = head;

        System.out.println("Original Display");
        originalDisplay(head);

        System.out.println();
        twoSumTargetNode(head, 18);
    }
}
