public class Arr_02 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int i=0;
       while(i<arr.length) {
         System.out.print(arr[i] +" ");
         i = i+1;
       }

       System.out.println();
       int j=0;
       while(j!=arr.length) {
          System.out.print(arr[j] +" ");
          j = j+1;
       }


       System.out.println();

       
       // multidimension array
       int arr2[][] = {{10,20,30},{40,50,60}};
       for(int k=0; k<arr2.length; k++) {
        for(int l=0;l<arr2[k].length; l++) {
            System.out.print(arr2[k][l] +" ");
        }
       }
    }

    
    
}
