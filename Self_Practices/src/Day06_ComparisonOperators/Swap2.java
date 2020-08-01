package Day06_ComparisonOperators;



public class Swap2{
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + b; // a = 25; b = 15;
        b = a - b; // b = 10; a = 25;
        a = a - b; // a = 15; b = 10;

        System.out.println(a);

        int d = 20;
        int c = 35;

        d = d + c; // d = 55; c = 35;
        c = d - c; // c = 20; d = 35;
        d = d - c; // d = 35; c = 20;

        System.out.println(c);


    }

}
