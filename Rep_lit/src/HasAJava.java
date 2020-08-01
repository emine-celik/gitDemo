import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()<4){
            System.out.println(exists);
        }
        if(word.substring(0,4).contains("java") || word.substring(1,5).contains("java")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }









    }
}
