public class Link_13_findIndexValue {

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
            if(head==null) {
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }

        int indexAtValue(int index) {
            Node temp = head;
            for(int i=0; i<(index-1); i++) {
                temp = temp.next;
            } 
            return temp.next.data;

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

        System.out.println("original LinkedList");
        ll.display();
        System.out.println("");
        System.out.println("index value is : " + ll.indexAtValue(3));
        
        
    }
    
}
