public class R_17_removeAccuranceString {

  public static void removeAccuranceString(String str) {
    String ans = "";
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i)!='a') {
        ans+=str.charAt(i);
      }
    }
    System.out.println(ans);
  }

  public static void recursivelyRemoveAccurance(String str,int index) {
    String ans = "";

    // base case
    if(index==str.length()) {
      return;
    }

    // self work
    if(str.charAt(index)!='a') {
      ans = ans+str.charAt(index);
      System.out.print(ans+"");
    }
    
    // recursive work
    recursivelyRemoveAccurance(str, index+1);
  }
  public static void main(String[] args) {
    String str = "sabaanm";
    removeAccuranceString(str);

    System.out.println("recursively remove accurance");
    recursivelyRemoveAccurance(str, 0);

  }
  
}
