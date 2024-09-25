public class que_04_ArrayImplementation {

    public static class queueA {
        int front = -1;
        int rear = -1;
        int size = 0;

        int arr[] = new int[5];

        void add(int value) {

            if (rear == arr.length) {
                System.out.println("Array Is Fulled");
                return;
            }

            if (front == -1) {
                front = rear = 0;
                arr[front] = value;
                rear++;
            }

            else {
                arr[rear] = value;
                rear++;
            }
            size++;
        }

        int remove() {

            if (size == 0) {
                System.out.println("Array is Empty cant remove possible");
                return -1;
            }
            int removeValue = arr[front];
            arr[front] = 0;
            front++;
            size--;
            return removeValue;
        }

        int peek() {
            int peekValue = arr[front];
            return peekValue;
        }

        void display() {
            for (int i = 0; i < arr.length; i++) {
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
        q.add(50);
        q.display();
        System.out.println();
        System.out.print("peek Values: " + q.peek());

        System.out.println();
        System.out.println("after remove diaplay");
        q.remove();
        q.display();

        System.out.println();
        System.out.print("Peek Value = " + q.peek());

    }
}
