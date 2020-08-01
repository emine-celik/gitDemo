package day01_Variables;

import java.util.Scanner;

/*
a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

 */
public class BurgerOrChicken50 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String in = s.next();
        float price=10.0f;
        float price2=2.0f;

        if(in.equals("burger") || (!in.equals("chicken"))){
            System.out.println("burger "+"\n" +price);
        }else{
            System.out.println("chiken "+" \n" +price);
        }
        if(in.equals("soda")){
            System.out.println("soda "+" \n" +price2);
        }



    }
}
