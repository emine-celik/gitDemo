package day01_Variables;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BulidRoute80 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if(start.equals("A")){
           if(end.equals("B")){
               System.out.println("right: "+end+" found");
           }else if(end.equals("C")){
               System.out.println("right > down: "+end+" found");
           }else if(end.equals("D")){
               System.out.println("right > down > left: "+end+" found");
            }else{
               System.out.println(end+" found");
           }
        }

        if(start.equals("B")){
            if(end.equals("C")){
                System.out.println("down: "+end+" found");
            }else if(end.equals("D")){
                System.out.println("down > left: "+end+" found");
            }else if(end.equals("A")){
                System.out.println("down > left > up: "+end+" found");
            }else{
                System.out.println(end+" found");
            }

        }
         if(start.equals("C")){
             if(end.equals("D")){
                 System.out.println("left: "+end+" found");
             }else if(end.equals("A")){
                 System.out.println("lef > up: "+end+" found");
             }else if(end.equals("B")){
                 System.out.println("left > up > right: "+end+" found");
             }else{
                 System.out.println(end+" found");
             }
         }

         if(start.equals("D")){
             if(end.equals("A")){
                 System.out.println("up: "+end+" found");
             }else if(end.equals("B")){
                 System.out.println("up > right: "+end+" found");
             }else if(end.equals("C")){
                 System.out.println("up > right > down: "+end+" found");
             }else{
                 System.out.println(end+" found");
             }
         }





    }
}
