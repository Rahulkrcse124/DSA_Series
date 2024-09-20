import java.util.Stack;

public class st_17_InfixToPrefix {

    public static void InfixToPrefix(String str) {

        Stack<Character> op = new Stack<>();
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int asci = (int) ch;
            String s = "" + ch;

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

            if (ch == '(') {
                op.push(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' && op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                String v2 = val.pop();
                String v1 = val.pop();
                char top = op.pop();
                String value = "" + top + v1 + v2;
                val.push(value);
                op.pop();
            }

            else if (ch == '*' || ch == '/') {
                if (op.peek() == '+' || op.peek() == '-') {
                    op.push(ch);
                } else if (op.peek() == '*') {
                    char top = op.pop();
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String value = "" + top + v1 + v2;
                    val.push(value);
                    op.push(ch);
                }
            }
        }

        while (val.size() > 1 && op.size() > 0) {
            String v2 = val.pop();
            String v1 = val.pop();
            char top = op.pop();
            String value = "" + top + v1 + v2;
            val.push(value);
        }
        System.out.println(val.peek());

    }

    public static void main(String args[]) {
        String str = "9-(5+3)*4/6";
        InfixToPrefix(str);
    }
}
