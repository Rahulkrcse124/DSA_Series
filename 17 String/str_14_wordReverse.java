public class str_14_wordReverse {
    public static void main(String[] args) {
        String str = "i am coder";

        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb.toString() + " ";
                sb = new StringBuilder("");
            }
        }

        sb.reverse();
        ans += sb.toString();

        System.out.println(ans);
    }
}
