package Day08_LogicalOperators;

public class GallonsToLitters {
    public static void main(String[] args) {

         double gallons = 15;
         double litters =gallons * 3.785;

        System.out.println(gallons+" gallons equal to "+litters+" litters");

        System.out.println("=============================");
        double litters1=1000;
        double gallons1 = litters1 / 3.785;

        System.out.println(litters1+" litters equal to "+(int)gallons1+" gallons");


    }
}
