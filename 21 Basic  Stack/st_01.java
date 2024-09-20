import java.util.Stack;

public class st_01 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // System.out.println(st.peek()); // 50
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size of stack : " + st.size());

        System.out.println();
        // first element print
        while (st.size() > 1) {
            st.pop();
        }
        System.out.println("first element is: " + st.peek());
    }
}