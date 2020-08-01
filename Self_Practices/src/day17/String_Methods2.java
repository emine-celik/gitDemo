package day17;

public class String_Methods2 {
    public static void main(String[] args) {

        String s1 ="Cat"; // String pool
        String s2 = new String("Cat"); // Heep
        String s3 =new String("Cat");

        //equals
        System.out.println(s2==s1);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s2==s3); // false
        System.out.println(s2.equals(s3)); // true

        // equalsIgnoreCase
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4 == s5);// false
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4.equalsIgnoreCase(s5)); // true

        // isEmpty : cheks if the length of string is 0

        String str ="  ";
        str.trim(); // if you assigned the trim you will get true
        System.out.println(str.isEmpty());// false

        // contains: included or not
        String str3= "Java,C3,Python , Ruby,C++";
        System.out.println(str3.contains("Java"));
        System.out.println(str3.contains("java"));






    }
}
