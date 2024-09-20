import java.util.Stack;

public class st_11_displayByFunction {

    public static void displayStack(Stack<Integer> stc) {
        Stack<Integer> tempst = new Stack<>();
        while (stc.size() > 0) {
            int x = stc.peek();
            tempst.push(x);
            stc.pop();
        }
        while (tempst.size() > 0) {
            int y = tempst.peek();
            System.out.print(y + " ");
            stc.push(y);
            tempst.pop();
        }
    }

    public static void removeIndexValue(Stack<Integer> stc, int index) {
        Stack<Integer> tempSt = new Stack<>();
        int n = stc.size() - index;

        while (stc.size() >= n) {
            int x = stc.peek();
            tempSt.push(x);
            stc.pop();
        }

        stc.pop(); // remove index value
        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            stc.push(y);
            tempSt.pop();
        }
        // for print
        while (stc.size() > 0) {
            int y = stc.peek();
            tempSt.push(y);
            stc.pop();
        }
        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            System.out.print(y + " ");
            stc.push(y);
            tempSt.pop();
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        displayStack(st);
        System.out.println();
        removeIndexValue(st, 2);

    }

}
