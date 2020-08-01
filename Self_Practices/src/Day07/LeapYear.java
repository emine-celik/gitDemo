package Day07;

public class LeapYear {
    public static void main(String[] args) {

       int year = 2000;
       boolean result =  year % 4 == 0;

        System.out.println(year+" is a Leap Year: "+result);


       // int number = 65;

       // boolean divisibleBy2 = number % 2 == 0;
      //  boolean divisibleBy3 = number % 3 == 0;
      //  boolean divisibleBy5 = number % 5 == 0;

       // System.out.println(divisibleBy5);


        int num1 = 78;

        boolean divisibleBy2 = num1 % 2 == 0;
        boolean divisibleBy3 = num1 % 3 == 0;
        boolean divisibleBy5 = num1 % 5 == 0;
        System.out.println(num1+" is evenly divisible by 2 : "+divisibleBy2);
        System.out.println(num1+" is evenly divisible by 3 : "+divisibleBy3);
        System.out.println(num1+" is evenly divisible by 5 : "+divisibleBy5);

    }
}
