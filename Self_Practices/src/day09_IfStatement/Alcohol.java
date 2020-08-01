package day09_IfStatement;

public class Alcohol {
    public static void main(String[] args) {
        boolean hasId= true;
        int age =19;

        boolean eligible = hasId && age >= 21;

        if(eligible==true ){
            System.out.println(eligible+" is eligible to buy alcohol");
        }else{
            System.out.println(eligible+" is not eligible");
        }




    }
}
