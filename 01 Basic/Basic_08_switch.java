import java.util.Scanner;
public class Basic_08_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the month for month between (1 to 12) = ");
        int month = sc.nextInt();
        
            switch(month){
                case 1:
                System.out.println("january");
                break;

                case 2:
                System.out.println("february");
                break;

                case 3:
                System.out.println("march");
                break;

                case 4:
                System.out.println("april");
                break;

                case 5:
                System.out.println("may");
                break;

                case 6:
                System.out.println("june");
                break;

                case 7:
                System.out.println("july");
                break;

                case 8:
                System.out.println("august");
                break;

                case 9:
                System.out.println("september");
                break;

                case 10:
                System.out.println("october");
                break;

                case 11:
                System.out.println("november");
                break;

                case 12:
                System.out.println("december");
                break;

                default:
                System.out.println("your input is wrong");
            }  
            sc.close();
    }
    
}
