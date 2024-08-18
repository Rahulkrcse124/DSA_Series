import java.util.Scanner;
public class str_06_stringintchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abc";
        str = str + "xyz";
        str = str+10;
        System.out.println(str);  

        System.out.println("ram"+10+20); // ram1020

        System.out.println(10+20+"rahul"); // 30rahul
        sc.close();
    }
    
}
