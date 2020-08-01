package day17;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/*
Write a program that will return max number out of three numbers.  No need to do any calculations.

Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.

Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();
        System.out.println("Enter second number: ");
        int num2=scan.nextInt();
        System.out.println("Enter third number: ");
        int num3=scan.nextInt();

        if(num1>num2 && num1<num3){
            System.out.println("Maximum number is: "+num1);
        }else if(num2<num1&& num3>num2){
            System.out.println("Maximum number is: "+num2);
        }else{
            System.out.println("Maximum number is: "+num3);
        }


    }
}
