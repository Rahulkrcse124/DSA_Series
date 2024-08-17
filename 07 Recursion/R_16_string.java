import java.util.Scanner;
public class R_16_string {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("name is " + name);

    System.out.println(name.substring(2,4));
    sc.close();
    
  }
  
}
