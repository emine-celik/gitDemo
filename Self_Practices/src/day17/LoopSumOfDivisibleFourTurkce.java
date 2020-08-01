package day17;

import java.util.Scanner;
/*
S
 */
public class LoopSumOfDivisibleFourTurkce {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numofelement =a.nextInt();
        int temp = 0;

        for(int i = 0; i <= numofelement; i++){

           int num = a.nextInt();
            if(num % 4 == 0){
                temp += num;
            }

        }

        System.out.println(temp);



    }
}
