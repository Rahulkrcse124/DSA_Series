import java.util.Stack;

public class st_12_displayRecursively {

    public static void displayRecursivelyReverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.peek();
        System.out.print(top + " ");

        st.pop();
        displayRecursivelyReverse(st);
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
        displayRecursivelyReverse(st);

    }
}
