package day10_IfElse;

public class Practice2 {
    /*
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 26;

        boolean eligible = hasID && age >= 21;
        //                  true &&  false ==> false

        String result = "";

        if(eligible == true){
            //  System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }

        if(eligible == false){
            //   System.out.println("Go buy milk");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

     */
    public static void main(String[] args) {
        int num = 0;
        String a="";

       if(num >= 0 && num <= 0){
        a = "is pozitive";
       }else if (num <= 0 && num >= 0){
           a = " is negative";
       }else if (num == 0 && num != 0){
           a = "is zero";
       }
        System.out.println(a);



    }
}
