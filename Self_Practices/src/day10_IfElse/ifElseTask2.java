package day10_IfElse;


import java.util.Scanner;

public class ifElseTask2 {
    public static void main(String[] args) {
        /*
          2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
         */

  /* ternary= // first task: convert the if statements above to ternary

        boolean eligible2 =  ?



        // second task: "can vote" or "Cannot vote"

        // third task: write a program that can check if two numbers are equal or not.

   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = scan.next();
        char a = firstname.charAt(0);

        System.out.println("Enter your last name");
        String lastname =scan.next();
        char b = lastname.charAt(0);

        System.out.println("Your initial is: "+a+"."+b);


    }



}
