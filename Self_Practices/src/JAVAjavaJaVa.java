import javax.management.MBeanAttributeInfo;

public class JAVAjavaJaVa {
    public static void main(String[] args) {
/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3

 */
        String  str = "JavajavaJAVA";
        String  word = "java";

       if(str.contains("java")){
           word=str;
       }

        str=(str.replaceFirst("java",""));



        System.out.println(str);










    }
}
