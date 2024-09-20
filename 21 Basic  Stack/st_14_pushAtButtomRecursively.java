import java.util.Stack;

public class st_14_pushAtButtomRecursively {

    public static void pushAtButtom(Stack<Integer> st, int value) {
        if (st.size() == 0) {
            st.push(value);
            return;
        }
        int top = st.pop();
        pushAtButtom(st, value);

        st.push(top);
    }

    public static void display(Stack<Integer> st) {
        Stack<Integer> tempst = new Stack<>();
        while (st.size() > 0) {
            int top = st.peek();
            tempst.push(top);
            st.pop();
        }
        while (tempst.size() > 0) {
            int top = tempst.peek();
            System.out.print(top + " ");
            st.push(top);
            tempst.pop();
        }
    }

    public static void displayByRecursive(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        display(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("original stack");
        display(st);

        System.out.println();
        System.out.println("after push the value in buttom stack");
        pushAtButtom(st, 100);
        display(st);

        System.out.println();
        System.out.println("disp");
    }
}
