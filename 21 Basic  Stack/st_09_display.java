import java.util.Stack;

public class st_09_display {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        Stack<Integer> tempSt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }

        while (tempSt.size() > 0) {
            int x = tempSt.peek();
            System.out.print(x + " ");
            st.push(x);
            tempSt.pop();
        }

        System.out.println();
        System.out.println();
        System.out.println();

    }

}
