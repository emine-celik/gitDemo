package Day07;

public class DivisibleBy2_By3_By5 {
    public static void main(String[] args) {

        int x = 699;

        boolean divisibleBy2 = x % 2 ==0;
        boolean divisibleBy3 = x % 3 == 0;
        boolean divisibleBy5 = x % 5 == 0;

        System.out.println(divisibleBy2);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);




    }
}
