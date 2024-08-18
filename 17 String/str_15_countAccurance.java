public class str_15_countAccurance {
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbccddde";
        String result = compressString(input);
        System.out.println(result);
    }
}

