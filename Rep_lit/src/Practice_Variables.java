import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_Variables {
    public static void main(String[] args) {
         int num = 100;
         double cost = 127;

        System.out.println(num+" "+cost);
         int i = 9;
         float f =33.4f;

        System.out.println("i=" +i+" " +"f="+f);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scan.next();
        char a =firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = scan.next();
        char b=lastName.charAt(0);

        System.out.println("Your initial is: " +a+b);



    }
}
