package day17;

import java.sql.SQLOutput;
import java.util.Scanner;
/*
warmup tasks:
    1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
    2. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
    3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
 */
public class task_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word"); //Apple
        String fruit = input.next();

        System.out.println("Enter your second word");
        String fruit2 =input.next();// "Banana"

        //String result= fruit.substring(1) devam et


    }
}
