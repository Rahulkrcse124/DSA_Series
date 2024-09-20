import java.util.Stack;

public class st_08_removeAtIndexValue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("original stack");
        System.out.print(st + " ");

        int index = 2;
        Stack<Integer> tempSt = new Stack<>();
        int n = st.size() - index;

        while (st.size() >= n) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }
        st.pop();

        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            st.push(y);
            tempSt.pop();
        }
        System.out.println();
        System.out.println("after remove the index value");
        System.out.print(st + " ");

    }

}
