public class S_03_stringLaxographical{

  public static void laxographicalSort(String str[]){
    for(int i=0; i<str.length-1; i++) {
      int minIndex = i;

      for(int j=i+1; j<str.length; j++) {
        if(str[j].compareTo(str[minIndex]) < 0) {
          minIndex = j;
        }
      }
      String temp = str[i];
      str[i] = str[minIndex];
      str[minIndex] = temp;
    }
  }

  public static void display(String str[]) {
    for(int i=0; i<str.length; i++) {
      System.out.print(str[i] + " , ");
    }
  }

  public static void main(String[] args) {
    String [] str = {"kiwi","apple","banana","mango"};

    laxographicalSort(str);
    display(str);
  }
}