package day01_Variables;
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
import java.util.Scanner;

public class PrintHalfTwice_69 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word =scan.next();
         int h=  word.length();


        System.out.println(" "+word.substring(0,h/2)+(word.substring(0,h/2)));









    }
}
