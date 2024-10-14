import java.util.*;

public class Bt_08_PrintPurmutation {

    public static void printPurmutation(String str, String t, List<String> list) {

        if (str.isEmpty()) {
            list.add(t);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // b

            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String merge = left + right;

            printPurmutation(merge, t + ch, list); // recursion call

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        printPurmutation(str, "", list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
