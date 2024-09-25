// public class que_07_CircularQueueArrayImplementation {

//     public static class circulaQueue {

//         int front = -1;
//         int rear = -1;
//         int size = 0;
//         int arr[] = new int[8];

//         void add(int value) {

//             if (size == arr.length) {
//                 System.out.println("Array is Fulled!");
//                 return;
//             }

//             if (front == -1) {
//                 front = rear = 0;
//                 arr[front] = value;
//                 rear++;
//             } else if (rear <= arr.length) {
//                 arr[rear] = value;
//                 rear++;
//             }

//             else if (size < rear) {
//                 rear = 0;
//                 arr[rear] = value;
//                 rear++;
//             }

//             size++;
//         }

//         int remove() {
//             int value = arr[front];
//             arr[front] = 0;
//             front++;
//             size--;
//             return value;
//         }

//         void display() {
//             // for (int i = front; i < rear; i++) {
//             // System.out.print(arr[i] + " ");
//             // }

//             if (size == 0) {
//                 System.out.println("Array is Empty!");
//                 return;
//             }

//             if (rear == arr.length) {
//                 for (int i = front; i < arr.length; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }

//             else if (rear < front) {
//                 // front to length of array
//                 for (int i = front; i < arr.length; i++) {
//                     System.out.print(arr[i] + " ");
//                 }

//                 // zero to rear
//                 for (int i = 0; i <= rear; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//     public static void main(String[] args) {

//         circulaQueue q = new circulaQueue();

//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         q.add(60);
//         q.add(70);
//         q.add(80);
//         q.display();

//         System.out.println();
//         // System.out.println("after fulled try to add new value");
//         // q.add(90);
//         // q.display();

//         System.out.println();
//         System.out.println();
//         System.out.println("after remove");
//         q.remove();
//         q.display();

//         System.out.println();
//         System.out.println();
//         System.out.println("after remove tyr to add value");
//         q.add(90);
//         q.display();

//     }

// }

public class que_07_CircularQueueArrayImplementation {

    public static class CircularQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];

        void add(int value) {
            if (size == arr.length) {
                System.out.println("Array is Full!");
                return;
            }

            if (front == -1) {
                front = rear = 0;
                arr[rear] = value;
            } else {
                rear = (rear + 1) % arr.length;
                arr[rear] = value;
            }

            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int value = arr[front];
            arr[front] = 0;
            front = (front + 1) % arr.length;
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

            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % arr.length;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

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
        System.out.println("After removing an element:");
        q.remove();
        q.display();

        System.out.println();
        System.out.println("After adding 90:");
        q.add(90);
        q.display();

        System.out.println();
        System.out.println();
        System.out.print("peek of array = " + q.peek());
    }
}
