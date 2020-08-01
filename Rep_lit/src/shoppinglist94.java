import java.util.Scanner;

public class shoppinglist94 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


       while(count<=10) {
            System.out.println("Enter Item"+count+" its and price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice+=price;

           shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";

            System.out.println("Add one more item?");
           countinue = scan.next();
           if(countinue.equalsIgnoreCase("yes")){
               count++;
               continue;


           }else{
               System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
               System.out.println("Total price: "+totalPrice);
               break;
           }
       }

    }
}
