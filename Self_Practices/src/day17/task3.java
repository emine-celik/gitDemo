package day17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName =scan.nextLine();

        System.out.println("Enter your lastName");
        String lastName=scan.nextLine();

        System.out.println("Enter your name uppercase");
        String fullName= firstName+" "+lastName;
        fullName=fullName.toUpperCase();

        System.out.println(fullName);

        fullName=fullName.toLowerCase();
        System.out.println(fullName);




    }
}
