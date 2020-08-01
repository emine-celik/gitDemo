package Day06_ComparisonOperators;

public class Swap {
    public static void main(String[] args) {

          int a = 10;
          int b = 15;

         // b = a; // b= 10
         // a = b; // a = 10

          int c = b; // c=15

        b = a;// b = 10
        a = c; //a =15

        System.out.println(a); // 15
        System.out.println(b); // 10


    }
}
