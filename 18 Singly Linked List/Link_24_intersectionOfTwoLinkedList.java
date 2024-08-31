// // leetcode 160
// public class Link_24_intersectionOfTwoLinkedList {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class LinkedList {
//         Node firstHead = null;
//         Node firstTail = null;
//         Node secondHead = null;
//         Node secondTail = null;

//         void firstAdd(int data) {
//             Node firstValue = new Node(data);
//             if (firstHead == null) {
//                 firstHead = firstValue;
//                 firstTail = firstValue;
//             } else {
//                 firstTail.next = firstValue;
//                 firstTail = firstValue;
//             }
//         }

//         void secondAdd(int data) {
//             Node secondValue = new Node(data);
//             if (secondHead == null) {
//                 secondHead = secondValue;
//                 secondTail = secondValue;
//             } else {
//                 secondTail.next = secondValue;
//                 secondTail = secondValue;
//             }
//         }

//         int firstSize() {
//             int firstCount = 0;
//             Node temp1 = firstHead;
//             while (temp1 != null) {
//                 firstCount++;
//                 temp1 = temp1.next;
//             }
//             return firstCount;
//         }

//         int secondSize() {
//             int secondCount = 0;
//             Node temp2 = secondHead;
//             while (temp2 != null) {
//                 secondCount++;
//                 temp2 = temp2.next;
//             }
//             return secondCount;
//         }

//         Node intersectionOfTwoLinkedList() {
//             Node temp1 = firstHead;
//             Node temp2 = secondHead;
//             int m = (firstSize() - secondSize());

//             for (int i = 1; i <= m; i++) {
//                 temp1 = temp1.next;
//             }
//             while (temp1 != temp2) {
//                 temp1 = temp1.next;
//                 temp2 = temp2.next;
//             }
//             return temp1;
//         }

//         void firstDisplay() {
//             Node temp1 = firstHead;
//             while (temp1 != null) {
//                 System.out.print(temp1.data + " ");
//                 temp1 = temp1.next;
//             }
//         }

//         void secondDisplay() {
//             Node temp2 = secondHead;
//             while (temp2 != null) {
//                 System.out.print(temp2.data + " ");
//                 temp2 = temp2.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.firstAdd(100);
//         ll.firstAdd(13);
//         ll.firstAdd(4);
//         ll.firstAdd(5);
//         ll.firstAdd(12);
//         ll.firstAdd(10);
//         ll.firstDisplay();

//         System.out.println();
//         ll.secondAdd(90);
//         ll.secondAdd(9);
//         ll.secondAdd(5);
//         ll.secondAdd(10);
//         ll.secondAdd(10);
//         ll.secondDisplay();

//         System.out.println();
//         Node intersection = ll.intersectionOfTwoLinkedList();
//         System.out.println("intersection is : " + intersection.data);
//     }
// }

public class Link_24_intersectionOfTwoLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node firstHead = null;
        Node firstTail = null;
        Node secondHead = null;
        Node secondTail = null;

        void firstAdd(int data) {
            Node firstValue = new Node(data);
            if (firstHead == null) {
                firstHead = firstValue;
                firstTail = firstValue;
            } else {
                firstTail.next = firstValue;
                firstTail = firstValue;
            }
        }

        void secondAdd(int data) {
            Node secondValue = new Node(data);
            if (secondHead == null) {
                secondHead = secondValue;
                secondTail = secondValue;
            } else {
                secondTail.next = secondValue;
                secondTail = secondValue;
            }
        }

        int firstSize() {
            int firstCount = 0;
            Node temp1 = firstHead;
            while (temp1 != null) {
                firstCount++;
                temp1 = temp1.next;
            }
            return firstCount;
        }

        int secondSize() {
            int secondCount = 0;
            Node temp2 = secondHead;
            while (temp2 != null) {
                secondCount++;
                temp2 = temp2.next;
            }
            return secondCount;
        }

        Node intersectionOfTwoLinkedList() {
            int size1 = firstSize();
            int size2 = secondSize();

            Node temp1 = firstHead;
            Node temp2 = secondHead;

            if (size1 > size2) {
                for (int i = 0; i < (size1 - size2); i++) {
                    temp1 = temp1.next;
                }
            } else if (size2 > size1) {
                for (int i = 0; i < (size2 - size1); i++) {
                    temp2 = temp2.next;
                }
            }

            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2) {
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return null;
        }

        void firstDisplay() {
            Node temp1 = firstHead;
            while (temp1 != null) {
                System.out.print(temp1.data + " ");
                temp1 = temp1.next;
            }
        }

        void secondDisplay() {
            Node temp2 = secondHead;
            while (temp2 != null) {
                System.out.print(temp2.data + " ");
                temp2 = temp2.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.firstAdd(100);
        ll.firstAdd(13);
        ll.firstAdd(4);
        ll.firstAdd(5);
        ll.firstAdd(12);
        ll.firstAdd(10);

        ll.secondAdd(90);
        ll.secondAdd(9);

        // Manually create an intersection by pointing the tail of the second list
        // to one of the nodes of the first list
        ll.secondTail.next = ll.firstHead.next.next.next; // Pointing to node with value 5

        ll.firstDisplay();

        System.out.println();
        ll.secondDisplay();

        System.out.println();
        Node intersection = ll.intersectionOfTwoLinkedList();
        if (intersection != null) {
            System.out.println("Intersection is at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
