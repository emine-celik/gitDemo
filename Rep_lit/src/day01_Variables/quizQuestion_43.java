package day01_Variables;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class quizQuestion_43 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        String a = s.nextLine();
        String result="";

        if(a.equals(a)){
            result=a+"is wrong";
        }else if(a.equals("c")){
            result=a+"is wrong";
        }else if(a.equals("b")){
            result=a+"is correct";
        }else{
            result=a+"is not valid answer";
        }
        System.out.println(result);







    }
}
