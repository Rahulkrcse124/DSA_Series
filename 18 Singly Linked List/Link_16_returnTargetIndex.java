public class Link_16_returnTargetIndex {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node value = new Node(data);
            if(head==null) {
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }

        int targetIndex(int target) {
            Node temp = head;
            int index = -1;
            // while(temp.next.data != target) {
            //     index++;
            //     temp= temp.next;
            // } 
            // return index+2;

            while(temp.data !=target) {
                index ++;
                temp = temp.next;
            } 
            return index+1;

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

        // System.out.println("target index is:");
        // System.out.println(ll.targetIndex(50));
        System.out.println();
        System.out.println(ll.targetIndex(50));

        
    }
    
}
