package day01_Variables;

import java.util.Scanner;

/*
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

 */
public class Replit30_Shoppinglist2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1=scan.nextDouble();


        System.out.println("Enter Item2, count and its price:");
        String item2 =scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        String item3 =scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();


        String report="";
        double totalPrice=(count1*price1)+(count2*price2)+(count3*price3);

        if(count2 ==0){
            report= "Item1: " +item1+ " Price: "+(price1*count1)+", Item3: "+item3+ " Price: "+(price3*count3);
        }else if(count3 ==0){
            report= "Item1: " +item1+ " Price: "+(price1*count1)+", Item2: "+item2+ " Price: "+(price2*count2);
        }else{
            report="Item2: " +item2+ " Price: "+(price2*count2)+", Item3: "+item3+ " Price: "+(price3*count3);
        }
        System.out.println(report);
        System.out.println("Total Price: " + totalPrice);
    }







    }

