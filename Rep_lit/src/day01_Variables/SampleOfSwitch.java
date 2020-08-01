package day01_Variables;

public class SampleOfSwitch {
    public static void main(String[] args) {

        String productName = "iphone";

        switch (productName) {

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case "MacBook":
                System.out.println("Apple");
                break;

            //   long c= 10;//10l
            //   float f= 10; // 10.0f
            //    double d= 10; // 10.0
            //SWITCH DOES NOT ACCEPT: BOOLEAN,DOUBLE,LONG AND BOOLEAN

        }
    }
}