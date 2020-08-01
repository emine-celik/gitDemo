package day01_Variables;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TipCalculate {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String split=scan.next();
        boolean split1=split.equalsIgnoreCase("yes");

        System.out.println("Number of people: ");
        int people=scan.nextInt();

        System.out.println("Check amount: ");
        double amount=scan.nextDouble();

        System.out.println("Service Quality: ");
        String quality=scan.next();

         double tip=0;
         if(quality.equals("Excellent")){
             tip =amount*0.25;
         }else if(quality.equals("Great")){
             tip = amount*0.20;
         }else if(quality.equals("Good")){
             tip=amount*0.15;
         }else if(quality.equals("Fair")){
             tip=amount*0.10;
         }else if(quality.equals("Poor")){
             tip=amount*0.5;
         }

       for(int i=0;i<=people;i++){
           System.out.println(i+"&");
       }

        System.out.println("Number of people entered: "+people);
        System.out.println("Total to pay: "+amount+tip);
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+(amount+tip)/people);
        System.out.println("Tip per person: "+tip/people);









    }
}
