package day01_Variables;

import java.util.Scanner;

public class Condotional_Contains48 {
    public static void main(String[] args) {
        String word = "Java";
        String sentence = "i love java";


        boolean sentence1 = sentence.contains(word);


        System.out.println(sentence1);

        System.out.println("=====================================");

        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input = scan.nextLine();

        while (!input.equals(password)) {
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }

        System.out.println("Logged in");
    }
    }