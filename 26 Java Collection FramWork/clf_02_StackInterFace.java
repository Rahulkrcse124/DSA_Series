import java.util.Stack;

public class clf_02_StackInterFace {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();

        // if we want to add the value in stack
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.print(st + " ");

        // if want to pop the top of stack
        System.out.println();
        st.pop();
        System.out.print(st + " ");

        // if we want to print the value of top
        System.out.println();
        int top = st.peek();
        System.out.print("top of stack = " + top);

        // if we check the stack is empty or not
        System.out.println();
        System.out.println(st.isEmpty());// false

        // if we want to check the value is present or not if value will be present then
        // then return its index otherwise return the -1
        System.out.println();
        System.out.println(st.search(20)); // index is 1
        System.out.println(st.search(100)); // 100 not exist then return the -1 index
    }

}
