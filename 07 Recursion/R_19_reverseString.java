import java.util.Scanner;
public class R_19_reverseString {

  public static void recursivelyReverseString(String str, int index) {
    String ans = "";
    // base case
    if(index==str.length()) {
      return ;
    }

    // recursively work
    recursivelyReverseString(str, index+1);

    // self work
    ans = ans+str.charAt(index);
    System.out.print(ans+"");
    
  }

  public static String reverseStringReturn(String str, int index){
    // base case
    if(index==str.length()){
      return "";
    }
    // recursive case
    String small = reverseStringReturn(str, index+1);
   
    //self work
    return small+str.charAt(index);

  }

  public static void reverseString(String str) {
    for(int i=str.length()-1; i>=0; i--) {
      System.out.print(str.charAt(i));
    }

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the string = ");
    String str = sc.nextLine();
   
    System.out.println("recursively reverse:");
    recursivelyReverseString(str, 0);

    System.out.println();
    System.out.println("reverse through the loop");
    reverseString(str);

    System.out.println();
    System.out.println("reverse string return type");
    System.out.println(reverseStringReturn(str, 0));
    sc.close();
    
  }
  
}
