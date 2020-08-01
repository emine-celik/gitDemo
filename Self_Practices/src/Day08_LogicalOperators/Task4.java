package Day08_LogicalOperators;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter max number");
        int a=scan.nextInt();
        System.out.println();
        int b=scan.nextInt();
        int c=scan.nextInt();
         if(a>b && b>c){
             System.out.println(a+" is max number");
         }else if(b>c && c>a){
             System.out.println(b+ " is max number");
         }else{
             System.out.println(c);

         }





    }
}
