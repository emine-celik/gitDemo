package Day0;


import java.util.ArrayList;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int min=999999999;
        for (int i = 0; i <3 ; i++) {
            System.out.println("enter a number");
            int minNumber=scan.nextInt();
            if(minNumber<min){
              min=minNumber;
            }


        }
        System.out.println("min number is "+min);

        System.out.println("=========================================");

        int num2=-233456755;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Enter a number");
            int maxNumber=scan.nextInt();
            if(maxNumber>num2){
                num2=maxNumber;
            }

        }
        System.out.println("max number is "+num2);








    }
}