import java.util.Stack;

public class st_15_RecursivelyRemoveAtIndexValue {

    public static void removeAtIndexValue(Stack<Integer> st, int index) {
        if (st.size() == index + 1) {
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtIndexValue(st, index);
        st.push(top);
    }

    public static void display(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        display(st);
        st.push(top);
        System.out.print(st.peek() + " ");
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("original");
        display(st);

        System.out.println();
        System.out.println("Stack after remove the index value");
        removeAtIndexValue(st, 2);
        display(st);
    }
}
