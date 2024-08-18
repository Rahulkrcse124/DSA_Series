import java.util.Scanner;
public class str_01_userInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = "jiet universe";
        System.out.println(str);

        // user input
        String s1 = sc.next();  // input: jiet universe
        System.out.println(s1);  // print only jiet

        String s2 = sc.nextLine(); // input : jiet universe
        System.out.println(s2); // output: jiet universe

        sc.close();
    }


}