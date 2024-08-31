public class Link_19_nthNodeFromLastReturnNode {

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node value = new Node(data);

            if(head == null) {
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }

        Node nthNodeFromLast(int nthNumberFromLast) {
            int n = nthNumberFromLast;
            Node slow = head;
            Node fast = head;
            for(int i=1; i<=n; i++) {
                fast = fast.next;
            }
            while(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.display();

        System.out.println();
        Node ans = ll.nthNodeFromLast(2);
        System.out.println(ans.data);
    }
    
}
