package day20_LOOP;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args) {

      /* int sum=0;
        int i =1;
        for(i=1; i <= 100; i++ ){
            sum += i;

        }
        System.out.print(sum+" ");
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num =scan.nextInt();

        int sum=0;

        if(num > 1) {


            for(int i = 1; i <= num; i++) {
                sum += i;

            }
            System.out.print(sum);
        }else{
            System.out.println("Invalid entry");
        }









    }
}


