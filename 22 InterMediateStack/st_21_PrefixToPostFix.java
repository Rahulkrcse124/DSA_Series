import java.util.Stack;

public class st_21_PrefixToPostFix {

    public static void preFixToPostFix(String preFix) {
        Stack<String> val = new Stack<>();
        for (int i = preFix.length() - 1; i >= 0; i--) {
            char ch = preFix.charAt(i);
            int asci = (int) ch;
            String s = "" + ch;

            if (asci >= 48 && asci <= 57) {
                val.push(s);
            }

            else {
                if (ch == '+') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + v2 + "+";
                    val.push(ans);
                } else if (ch == '-') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + v2 + "-";
                    val.push(ans);
                } else if (ch == '*') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + v2 + "*";
                    val.push(ans);
                } else if (ch == '/') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + v2 + "/";
                    val.push(ans);
                }

            }
        }
        System.out.println(val.peek());
    }

    public static void main(String[] args) {
        // String str = "9-(5+3)*4/6";
        String preFix = "-9/*+5346";
        preFixToPostFix(preFix);

    }

}
