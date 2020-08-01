package day01_Variables;

import java.util.Scanner;

/*
 The variable "name" holds a String user input

Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student
 */
public class Conditional48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("In:");
        String name = input.nextLine();

        if(name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }






    }
}
