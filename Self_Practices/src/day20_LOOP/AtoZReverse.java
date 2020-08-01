package day20_LOOP;

public class AtoZReverse {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("===============================================");

        for(int i= 97; i <=122; i++) {
           // char ch =(char) i;
            System.out.print((char) i + " ");

        }
        System.out.println();
        System.out.println("=======================================");

        System.out.println();

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+" ");
        }








    }
}
