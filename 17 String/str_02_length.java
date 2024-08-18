import java.util.Scanner;
public class str_02_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string:");
        String str = sc.nextLine();

        int lengthOfString = str.length(); // then length function is also count the space
        System.out.println("length of string is:" + lengthOfString );


        // .charAt(index) : we can excess of index value
        System.out.println(str.charAt(5));

        sc.close();
    }
    
}
