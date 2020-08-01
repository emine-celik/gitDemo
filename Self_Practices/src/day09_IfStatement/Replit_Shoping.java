package day09_IfStatement;
/*
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count,
 price and you will calculate total price and show as a report.
 - Hint :
  The unit test assumes that item1 count is always more than 0
  The only situations you need to handle are either item2 count is 0 or item3 count is 0.
  Think simple and just handle the only item2 is 0 or  only item3 is 0 branches

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"

 */
import java.util.Scanner;

public class Replit_Shoping {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1,count and its price:");
        String item1 = scan.next();
        double price1=scan.nextDouble();
        int count1 = scan.nextInt();

        System.out.println("Enter Item2,count and its price:");
        String item2 =scan.next();
        double price2 = scan.nextDouble();
        int count2 = scan.nextInt();

        System.out.println("Enter Item3,count and its price:");
        String item3 =scan.next();
        double price3 = scan.nextDouble();
        int count3 = scan.nextInt();

        double totalPrice=price1+price2+price3;
        String report=item1+item2+item3;


        if(count2 > 0){

        }
        if(count3 > 0){

        }













    }
}
