package Day08_LogicalOperators;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name= scan.next();

        System.out.println("Enter your last name");
        String lastName =scan.next();

        System.out.println("Enter your age");
        int age=scan.nextInt();

        System.out.println("Enter your marrige statuse");
        String marrige = scan.next();


       if(age >= 19){
           System.out.println("You are aligible to vote");
       }
       if(age <= 19){
           System.out.println("You are not aligible to vote");
       }





    }
}
