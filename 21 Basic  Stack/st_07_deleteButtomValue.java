import java.util.Stack;

public class st_07_deleteButtomValue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("original stack");
        System.out.print(st + " ");

        Stack<Integer> tempSt = new Stack<>();
        while (st.size() > 1) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }
        st.pop();
        System.out.println();

        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            st.push(y);
            tempSt.pop();
        }
        System.out.println("after remove buttom value of stack");
        System.out.print(st + " ");

    }

}
