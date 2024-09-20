import java.util.Stack;

public class st_18_InfixToPostFix {

    public static void infixToPostFix(String infix) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            String s = "" + ch;

            int asci = (int) ch;

            if (asci >= 48 && asci <= 57) {
                if (val.size() == 0) {
                    val.push(s);
                } else {
                    val.push(s);
                }
            }

            if (op.size() == 0) {
                op.push(ch);
            }

            if (op.size() > 0) {

                if (ch == '(') {
                    op.push(ch);
                }

                else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' && op.peek() == '(') {
                    op.push(ch);
                }

                else if (ch == ')') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char top = op.pop();
                    String value = v1 + v2 + top;
                    val.push(value);
                    op.pop();
                } else if (ch == '*' || ch == '/') {

                    if (op.peek() == '+' || op.peek() == '-') {
                        op.push(ch);
                    } else if (op.peek() == '*') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char top = op.pop();
                        String value = v1 + v2 + top;
                        val.push(value);
                        op.push(ch);
                    } else if (op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char top = op.pop();
                        String value = v1 + v2 + top;
                        val.push(value);
                        op.push(ch);
                    }
                }

            }
        }

        while (val.size() > 1 && op.size() > 0) {
            String v2 = val.pop();
            String v1 = val.pop();
            char top = op.pop();
            String value = v1 + v2 + top;
            val.push(value);
        }
        System.out.println(val.peek());

    }

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        infixToPostFix(infix);
    }

}