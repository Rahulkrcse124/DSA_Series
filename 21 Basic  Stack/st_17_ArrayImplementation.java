public class st_17_ArrayImplementation {

    public static class Stack {
        int arr[] = new int[5];
        int index = 0;

        void push(int x) {
            if (isFull()) {
                return;
            }
            arr[index] = x;
            index++;
        }

        int peek() {
            if (index == 0) {
                System.out.println("array is Empty");
                return -1;
            }
            return arr[index - 1];
        }

        void pop() {
            if (index == 0) {
                System.out.println("Array is empty");
                return;
            }
            arr[index - 1] = 0;
            index--;
        }

        void display() {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
        }

        int size() {
            // int length = 0;
            // for (int i = 0; i < index; i++) {
            // length++;
            // }
            // return length;
            return index;
        }

        boolean isEmpty() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return true;
            } else {
                return false;
            }
        }

        boolean isFull() {
            if (index == arr.length) {
                System.out.println("Stack is Full");
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        st.push(50);
        st.display();

        st.push(100); // the value will not push because is fulled

        System.out.println("size of stack is " + st.size());

        System.out.println("perform the pop operation");
        st.pop();
        st.display();

        System.out.println("size of stack");
        System.out.println(st.size());

        System.out.println("perform peek operation");
        System.out.println(st.peek());

    }
}