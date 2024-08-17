import java.util.Scanner;
public class Basic_19_sumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the series number = ");
        int n = sc.nextInt();
        int sumOfSeries = 0;

        for(int i=0; i<=n; i++){
            if(i%2==0){
                sumOfSeries = sumOfSeries-i;
            }
            else{
                sumOfSeries = sumOfSeries+i;
            }
        }
        System.out.println("sum of series is = "+sumOfSeries);
        sc.close();
        
    }
    
}
