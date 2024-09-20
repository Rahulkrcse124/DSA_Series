import java.util.Stack;

public class st_03_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Original Stack");
        System.out.print(st + " ");

        System.out.println();

        Stack<Integer> rst = new Stack<>();
        while (st.size() > 0) {
            int topValue = st.peek();
            rst.push(topValue);
            st.pop();
        }
        System.out.println();
        System.out.println("after reverse Stack");
        System.out.print(rst + " ");

    }

}
