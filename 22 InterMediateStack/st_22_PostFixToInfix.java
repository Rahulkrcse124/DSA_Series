import java.util.Stack;

public class st_22_PostFixToInfix {

    public static void PostFixToInfix(String postFix) {
        Stack<String> val = new Stack<>();

        for (int i = 0; i < postFix.length(); i++) {
            char ch = postFix.charAt(i);
            int asci = (int) ch;
            String s = "" + ch;

            if (asci >= 48 && asci <= 57) {
                val.push(s);
            } else {
                if (ch == '+') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = v1 + "+" + v2;
                    val.push(ans);
                } else if (ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = v1 + "-" + v2;
                    val.push(ans);
                } else if (ch == '*') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = v1 + "*" + v2;
                    val.push(ans);
                } else if (ch == '/') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = v1 + "/" + v2;
                    val.push(ans);
                }
            }
        }
        System.out.println(val.peek());
    }

    public static void main(String[] args) {
        String postFix = "953+4*6/-";
        PostFixToInfix(postFix);
    }

}
