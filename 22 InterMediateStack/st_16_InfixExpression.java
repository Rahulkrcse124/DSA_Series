import java.util.Stack;

public class st_16_InfixExpression {

    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int) ch;

            if (asci >= 48 && asci <= 57) {
                st.push(asci - 48);
            }

            else if (op.size() == 0) {
                op.push(ch);
            }

            else {

                if (ch == '+' || ch == '-') {
                    int v2 = st.pop();
                    int v1 = st.pop();

                    if (op.peek() == '+') {
                        int ans = v1 + v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    }

                    else if (op.peek() == '-') {
                        int ans = v1 - v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    }

                    else if (op.peek() == '*') {
                        int ans = v1 * v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    } else if (op.peek() == '/') {
                        int ans = v1 / v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    }
                }

                if (ch == '*' || ch == '/') {

                    if (op.peek() == '+' || op.peek() == '-') {
                        op.push(ch);
                    }

                    else if (op.peek() == '*') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        int ans = v1 * v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    }

                    else if (op.peek() == '/') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        int ans = v1 / v2;
                        st.push(ans);
                        op.pop();
                        op.push(ch);
                    }
                }
            }

        }

        while (st.size() > 1) {

            if (op.peek() == '+') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 + v2);

            }

            else if (op.peek() == '-') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 - v2);

            } else if (op.peek() == '*') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 * v2);

            } else if (op.peek() == '/') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 / v2);

            }
            op.pop();
        }
        System.out.println(st.peek());
    }
}

// import java.util.Stack;

// public class st_17_InfixExpression {

// public static void main(String[] args) {
// String str = "9-6+3*4/6";
// Stack<Integer> st = new Stack<>();
// Stack<Character> op = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// int asci = (int) ch;

// if (asci >= 48 && asci <= 57) {
// st.push(asci - 48);
// }

// else if (op.size() == 0) {
// op.push(ch);
// }

// else {
// if (ch == '+' || ch == '-') {

// if (st.size() >= 2) {
// int v2 = st.pop();
// int v1 = st.pop();

// if (op.peek() == '+') {
// int ans = v1 + v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }

// else if (op.peek() == '-') {
// int ans = v1 - v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }

// else if (op.peek() == '*') {
// int ans = v1 * v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }

// else if (op.peek() == '/') {
// int ans = v1 / v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }
// }
// }

// if (ch == '*' || ch == '/') {

// if (op.size() > 0 && st.size() >= 2) {

// if (op.peek() == '*') {
// int v2 = st.pop();
// int v1 = st.pop();
// int ans = v1 * v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }

// else if (op.peek() == '/') {
// int v2 = st.pop();
// int v1 = st.pop();
// int ans = v1 / v2;
// st.push(ans);
// op.pop();
// op.push(ch);
// }

// else if (op.peek() == '+' || op.peek() == '-') {
// op.push(ch);
// }

// }
// // else {
// // op.push(ch);
// // }
// }
// }
// }

// while (st.size() > 1 && op.size() > 0) {

// if (op.peek() == '+') {
// int v2 = st.pop();
// int v1 = st.pop();
// st.push(v1 + v2);
// }

// else if (op.peek() == '-') {
// int v2 = st.pop();
// int v1 = st.pop();
// st.push(v1 - v2);
// }

// else if (op.peek() == '*') {
// int v2 = st.pop();
// int v1 = st.pop();
// st.push(v1 * v2);
// }

// else if (op.peek() == '/') {
// int v2 = st.pop();
// int v1 = st.pop();
// st.push(v1 / v2);
// }

// op.pop();
// }

// if (!st.isEmpty()) {
// System.out.println(st.peek());
// }
// }
// }
