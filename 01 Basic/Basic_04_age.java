import java.util.Scanner;
public class Basic_04_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the age");
        int age = sc.nextInt();
        
        if(age<12){
            System.out.println("it is a child ");
        }
        else if ( age >=12 && age <=18 ) {
            System.out.println("it is teenager");

        }
        else  {
            System.out.println("it is a Adult");
        }
        sc.close();
    }
    
}
