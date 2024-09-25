public class que_03_ArrayImplementation {

    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[5];

        void add(int value) {
            if (r == arr.length - 1) {
                System.out.println("queue is full: ");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = value;
                r++;
            } else {
                arr[r] = value;
                r++;
            }
        }

        int remove() {
            if (size == 0) {
                System.out.println("size is Empty");
                return -1;
            }
            size--;
            return f++;
        }

        int peek() {
            return arr[f];
        }

        void display() {
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("display queue");
        q.display();

        System.out.println();
        q.remove();
        q.display();

    }

}
