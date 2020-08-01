package day01_Variables;
import java.util.Scanner;
public class Replit032 {


    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        int inputSecond = scan.nextInt();
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int second = scan.nextInt();

        System.out.println("Enter seconds");
        int result = hours / 360 + minutes / 60 + second % 60;
        System.out.println(result);













    }

}





