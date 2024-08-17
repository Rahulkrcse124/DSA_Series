import java.util.Scanner;
public class R_18_removeDifferenceString {

  // simple print through loop
  public static void printSameString(String str) {
    String ans = "";
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i)=='a') {
        ans = ans+str.charAt(i);
      }
    }
    System.out.print(ans+"");
  }

  // recursively
  public static void recursivelyPrintSame(String str,int index) {
    String ans = "";
    // base case
    if(index==str.length()) {
      return ;
    }
     
    // self work
    if(str.charAt(index)=='a') {
      ans = ans+str.charAt(index);
      System.out.print(ans+"");
    }
    
    // recursive work
    recursivelyPrintSame(str, index+1);

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();
    printSameString(str);    

    System.out.println(" ");
    System.out.println("recursively print the only same");
    recursivelyPrintSame(str, 0);
    sc.close();
    
  }
}


/*
enter the string
moaahan
aaa
 */
