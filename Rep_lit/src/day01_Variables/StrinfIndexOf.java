package day01_Variables;

import java.util.Scanner;

public class StrinfIndexOf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String txt = scan.next();

        int  lastIndex= txt.length()-1;
        System.out.println(txt.substring(0,lastIndex));



    }
}
