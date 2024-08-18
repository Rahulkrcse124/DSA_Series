public class str_13_stringPalindrom{

    public static boolean checkPalindom(String str) {
        String fromStart = "";
        String fromEnd = "";
        for(int i=0; i<str.length(); i++){
            fromStart += str.charAt(i);
        }
        for(int j=str.length()-1; j>=0; j--) {
            fromEnd += str.charAt(j); 
        }
        if(fromStart.equals(fromEnd)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkPalindom2(String str) {
        int start=0;
        int end = str.length()-1;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "mom";
        System.out.println(checkPalindom(str));
        System.out.println();
        System.out.println(checkPalindom2(str));
    }
}