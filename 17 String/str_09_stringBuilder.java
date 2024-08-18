public class str_09_stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);

        str.setCharAt(0,'d');
        System.out.println(str); // delloworld


        /*  String str2 = "hello";  these are not possible because only .append() possible
           in stringBuilder
           str2.append("hello") // show the error

           str2.setCharAt(0,'d'); // not possible in string
        */


    } 
    
}
