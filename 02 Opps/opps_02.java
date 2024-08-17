import java.util.Scanner;
class students{
    int id;
    String StudentName;
    String collegeName;
    String branch;
    int payment; 
}
public class opps_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students obj = new students();
        System.out.println("enter the id : ");
        obj.id = sc.nextInt();

        System.out.println("enter the studentNmae : ");
        obj.StudentName = sc.nextLine();

        System.out.println("enter the college name : ");
        obj.collegeName = sc.nextLine(); 

        System.out.println("enter the branch name : ");
        obj.branch = sc.nextLine();

        System.out.println("enter the payment for admission: ");
        obj.payment = sc.nextInt();

        System.out.println("student id is : " + obj.id);
        System.out.println("student name is : " + obj.StudentName);
        System.out.println("college name is : " + obj.collegeName);
        System.out.println("branch name is : " + obj.branch);
        System.out.println("your payments is : " + obj.payment);

        sc.close();
    }
}