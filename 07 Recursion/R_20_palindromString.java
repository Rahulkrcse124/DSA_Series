import java.util.Scanner;
public class R_20_palindromString {

  public static boolean palindromString(String str) {
    String leftToRight = "";
    String rightToLeft = "";

    for(int i=0; i<str.length(); i++) {
      leftToRight =leftToRight + str.charAt(i);
    }

    for(int j=str.length()-1; j>=0; j--) {
      rightToLeft = rightToLeft + str.charAt(j);
    }

    if(leftToRight.equals(rightToLeft)) {
      return true;
    }
    return false;
  }

  static boolean recursivelyPalindrom(String str, int l, int r) {
    if(l>=r) return false;

    return (str.charAt(l)==str.charAt(r) && recursivelyPalindrom(str, l+1, r-1));

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();
    System.out.println(palindromString(str));

    System.out.println("");
    System.out.println("recursively check palindrom or not");

    // if(recursivelyPalindrom(str, 0,str.length()-1)){
    //   System.out.println("yes palindrom");
    // }
    // else{
    //   System.out.println("not palindrom");
    // }
    System.out.println(recursivelyPalindrom(str, 0, str.length()-1));

    sc.close();
  }
  
}
