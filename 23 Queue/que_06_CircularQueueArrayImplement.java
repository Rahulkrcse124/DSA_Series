public class que_06_CircularQueueArrayImplement {

    public static class queueA {

        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];

        void add(int value) {

            if (size == arr.length) {
                System.out.println("array is Fulled!");
                return;
            }

            else if (front == -1) {
                front = rear = 0;
                arr[front] = value;
                rear++;
            }

            else if (rear < arr.length - 1) {
                arr[rear] = value;
                rear++;

            }

            else if (rear == arr.length - 1) {
                rear = 0;
                arr[rear] = value;
                rear++;
            }
            size++;
        }

        int remove() {

            if (size == 0) {
                System.out.println("Array is Empty");
                return -1;
            } else if (front == arr.length - 1) {
                int value = arr[front];
                front = 0;
                return value;
            }

            int value = arr[front];
            front++;
            return value;
        }

        int peek() {
            return arr[front];
        }

        void display() {

            if (size == 0) {
                System.out.println("Array is Empty!");
                return;
            }

            else if (front < rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            else if (rear <= front) {
                for (int i = front; i < arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int j = 0; j <= rear; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
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
        q.add(60);
        q.add(70);
        q.add(80);
        q.display();

        System.out.println();
        System.out.println("after remove");
        q.remove();
        q.remove();
        q.remove();
        q.display();

        System.out.println();
        System.out.print("peek of array is = " + q.peek());

        System.out.println();
        System.out.println("after remove i want to add new value");
        q.add(100);
        q.display();

    }
}